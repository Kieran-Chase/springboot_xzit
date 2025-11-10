package com.xzit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/10
 */
@RestController
public class StudentController {

    @GetMapping("list")
    public String list(){
        return "hello spring boot 2";
    }
}
