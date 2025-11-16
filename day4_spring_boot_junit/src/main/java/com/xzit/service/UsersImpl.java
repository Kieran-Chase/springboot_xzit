package com.xzit.service;

import com.xzit.dao.UsersDao;
import com.xzit.entity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/15
 */
@Service
public class UsersImpl implements UsersService{
    @Resource
    private UsersDao dao;

    @Override
    public List<Users> list() {
        return dao.selectList();
    }
}
