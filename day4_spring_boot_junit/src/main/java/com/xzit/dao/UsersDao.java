package com.xzit.dao;

import com.xzit.entity.Users;

import java.util.List;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/15
 */
public interface UsersDao {
    List<Users> selectList();
}
