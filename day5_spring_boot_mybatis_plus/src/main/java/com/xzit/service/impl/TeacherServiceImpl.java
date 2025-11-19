package com.xzit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzit.entity.Teacher;
import com.xzit.mapper.TeacherMapper;
import com.xzit.service.TeacherService;
import org.springframework.stereotype.Service;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/19
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
}
