package com.xzit.dao;

import com.xzit.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/15
 */
@Repository
public class UsersDaoImpl implements UsersDao{
    @Override
    public List<Users> selectList() {
        List<Users> list=new ArrayList<>();
        list.add(new Users(1,"张三","男",24));
        list.add(new Users(2,"李四","女",23));
        list.add(new Users(3,"王五","男",26));
        list.add(new Users(4,"赵六","男",24));
        return list;
    }
}
