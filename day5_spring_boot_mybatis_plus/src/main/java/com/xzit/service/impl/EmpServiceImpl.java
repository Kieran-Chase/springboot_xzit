package com.xzit.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzit.entity.Emp;
import com.xzit.mapper.EmpMapper;
import com.xzit.service.EmpService;
import org.springframework.stereotype.Service;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/20
 */
@Service
@DS("slave")
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {
}
