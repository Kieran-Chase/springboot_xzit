package com.xzit.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xzit.entity.Member;
import com.xzit.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/24
 */
@Controller
@RequestMapping("/member")
public class MemberController {
    @Resource
    private MemberService service;

    @GetMapping("/save")
    public String save(){
        return "/save";
    }
    @PostMapping("/save_commit")
    public String save_commit(Member member){
        service.save(member);
        return "redirect:/member/list";//跳回列表页的处理
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable int id,Model model){
        Member member=service.getById(id);
        model.addAttribute("member",member);
        return "/update";

    }
    @PostMapping("/update_commit")
    public String update_commit(Member member){
        service.updateById(member);
        return "redirect:/member/list";//跳回列表页
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        service.removeById(id);
        return "redirect:/member/list";//跳回列表页
    }
    @GetMapping("/list")
    public String list(@RequestParam(required = false,defaultValue = "1",value = "current") Integer current,
                       Model model){
        Page<Member> page=new Page<>(current,5);
        service.page(page);
        model.addAttribute("path","/member/list?current=");
        // page.getT
        // page.getRecords()
        model.addAttribute("page",page);
        return "/list";
    }
}
