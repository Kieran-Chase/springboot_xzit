package com.xzit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/10
 */
//服务器
//内嵌了容器:Tomcat
@SpringBootApplication
public class AppServer {
    public static void main(String[] args) {
        SpringApplication.run(AppServer.class,args);

    }
}
