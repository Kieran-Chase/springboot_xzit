package com.xzit.model;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/13
 */
@Component
@Data
public class Student {
    private String name;
    private int age;
}
