package com.xzit.gene.service.impl;

import com.xzit.gene.entity.Emp;
import com.xzit.gene.mapper.EmpMapper;
import com.xzit.gene.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Kieran
 * @since 2025-11-21
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {
    @Resource
    private EmpMapper mapper;
    @Override
    public List<Emp> testSelect() {
        return mapper.testSelect();
    }
}
