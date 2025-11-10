package com.xzit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/10
 */
/*@Controller//表明当前是一个控制器，被spring容器所管理
@ResponseBody//表明当前是返回json格式*/
@RestController
public class IndexController {
    @GetMapping("/index")
    public Object index(){
        return "hello spring boot";
    }
}
