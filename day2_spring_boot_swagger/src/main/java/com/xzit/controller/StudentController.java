package com.xzit.controller;

import com.xzit.model.Student;
import io.swagger.annotations.*;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/12
 */
@RestController
@RequestMapping("/student")
@Api(tags={"学生管理"})//用在类上，表示类的说明  tags 表示说明该类的作用。
public class StudentController {

    @GetMapping()
    //用在方法上，说明方法的用途和作用
    @ApiOperation(value = "显示全部学生数据")
    public Object list(){
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"张三","男",20));
        list.add(new Student(2,"李四","女",22));
        list.add(new Student(3,"王五","男",23));
        return list;
    }

    @GetMapping("/{id}")
    @ApiOperation("按给定Id来查询学生信息")
    @ApiImplicitParams(
            @ApiImplicitParam(
                    name="id",value="学生id",required = true,
                    paramType = "path",
                    dataType = "Integer", dataTypeClass = Integer.class
            )
    )
    public Object selectById(@PathVariable int id){
        return new Student(id,"王某","男",22);
    }

    @DeleteMapping("{id}")
    @ApiOperation("按给定Id删除学生信息")
    public Object deleteById(@ApiParam(name="id",value="学生id")  @PathVariable int id){
        return "已删除给定Id为"+id+"的学生信息";
    }

    @PostMapping()
    @ApiOperation("新增学生")
    public Object save(@RequestBody Student student){
        return student;
    }

    @PutMapping()
    @ApiOperation("更新学生")
    public Object update(@RequestBody Student student){
        return student;
    }
}

/*
restful风格
学生管理
/student 查询 get
/student 新增 post
/student 更新 put
/student/1 删除 delete
/student/1 根据id查询 get
 */