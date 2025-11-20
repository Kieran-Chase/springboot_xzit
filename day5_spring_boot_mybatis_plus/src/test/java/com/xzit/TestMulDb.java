package com.xzit;

import com.xzit.entity.Emp;
import com.xzit.entity.Teacher;
import com.xzit.service.EmpService;
import com.xzit.service.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/20
 */
@SpringBootTest
public class TestMulDb {
    @Resource
    private TeacherService teacherService;
    @Resource
    private EmpService empService;

    @Test
    public void selectTeacher(){
        List<Teacher> list=teacherService.list();
        list.forEach(System.out::println);
    }

    @Test
    public void saveEmp(){
        Emp emp=new Emp();
        emp.setName("王某");
        emp.setAddr("南京");
        empService.save(emp);

    }
}
