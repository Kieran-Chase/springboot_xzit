package com.xzit.service;

import com.xzit.entity.Student;

import java.util.List;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/16
 */
public interface StudentService {
    List<Student> selectList();
    Student selectId(Integer id);
    int save(Student student);
    int update(Student student);
    int delete(Integer id);
}
