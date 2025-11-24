package com.xzit.controller;

import com.xzit.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/24
 */
//@RestController//返回json
@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("title","我的新首页");
        User user = new User();
        user.setName("张三");
        model.addAttribute("user",user);
        return "index";
    }
}
