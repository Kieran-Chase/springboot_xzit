package com.xzit.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/13
 */
@Data
@Component
@ConfigurationProperties(prefix="com.xzit.model.users")
public class Users {
    private String name;
    private String gender;
    private int age;
    private double money;
    private LocalDate birth;

    private List<Student> stuList;
    private List<Student> stuList1;

    /*private List<String> likes;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Map<String,String> map1;*/
}
