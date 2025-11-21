package com.xzit.gene.service;

import com.xzit.gene.entity.Emp;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Kieran
 * @since 2025-11-21
 */
public interface IEmpService extends IService<Emp> {
    List<Emp> testSelect();

}
