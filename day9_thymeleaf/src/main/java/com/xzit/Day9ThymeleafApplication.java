package com.xzit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("com.xzit.mapper")
public class Day9ThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day9ThymeleafApplication.class, args);
    }

}
