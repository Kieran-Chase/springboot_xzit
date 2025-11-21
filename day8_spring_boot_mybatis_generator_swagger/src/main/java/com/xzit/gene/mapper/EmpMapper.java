package com.xzit.gene.mapper;

import com.xzit.gene.entity.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Kieran
 * @since 2025-11-21
 */
public interface EmpMapper extends BaseMapper<Emp> {
    List<Emp> testSelect();
}
