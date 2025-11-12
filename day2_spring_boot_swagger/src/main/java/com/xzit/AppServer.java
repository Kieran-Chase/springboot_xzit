package com.xzit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/11
 */
@SpringBootApplication
@EnableOpenApi
public class AppServer {
    public static void main(String[] args) {
        SpringApplication.run(AppServer.class,args);
    }
}
