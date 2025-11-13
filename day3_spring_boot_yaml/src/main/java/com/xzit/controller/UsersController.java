package com.xzit.controller;

import com.xzit.model.Users;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/13
 */
@RestController
@RequestMapping("/user")
public class UsersController {
    @Resource
    private Users user;

    @Resource
    private Environment env;

    @GetMapping
    public Object showYaml(){
        return user;
    }

    @GetMapping("env")
    public Object inv(){
        System.out.println(env.getProperty("sysUser"));
        System.out.println(env.getProperty("age"));
        System.out.println(env.getProperty("com.xzit.model.users.money"));
        System.out.println(env.getProperty("com.xzit.model.users.birth"));
        return "user";
    }

}
