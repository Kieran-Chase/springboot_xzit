package com.xzit.service.impl;

import com.xzit.entity.Student;
import com.xzit.mapper.StudentMapper;
import com.xzit.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/16
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper mapper;

    @Override
    public List<Student> selectList() {
        return mapper.selectList();
    }

    @Override
    public Student selectId(Integer id) {
        return mapper.selectId(id);
    }

    @Override
    public int save(Student student) {
        return mapper.save(student);
    }

    @Override
    public int update(Student student) {
        return mapper.update(student);
    }

    @Override
    public int delete(Integer id) {
        return mapper.delete(id);
    }
}
