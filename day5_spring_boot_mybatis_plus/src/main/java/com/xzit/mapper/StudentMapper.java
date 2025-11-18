package com.xzit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xzit.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/18
 */
public interface StudentMapper extends BaseMapper<Student>{
    List<Student> selectCustomer();
    Page<Student> selectCustomerPage(@Param("page") Page page,@Param("age") int age);
}
