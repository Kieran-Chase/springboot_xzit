package com.xzit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/13
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${sysUser}")
    private String sysUser;
    @Value("${age}")
    private int age;

    @GetMapping
    public Object show(){
        System.out.println(sysUser+"\t"+age);
        return "ok";
    }
}
