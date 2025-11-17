package com.xzit;

import com.xzit.entity.Student;
import com.xzit.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class Day4SpringBootmybatisApplicationTests {
    @Resource
    private StudentService service;

    @Test
    void contextLoads() {
        List<Student> list=service.selectList();
        list.forEach(System.out::println);
    }

}
