package com.xzit;

import com.xzit.entity.Users;
import com.xzit.service.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class Day4SpringBootJunitApplicationTests {
    @Resource
    private UsersService service;

    @Test
    void contextLoads() {
        List<Users> list=service.list();
        list.forEach(System.out::println);
    }

}
