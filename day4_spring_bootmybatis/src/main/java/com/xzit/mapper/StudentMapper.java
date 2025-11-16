package com.xzit.mapper;

import com.xzit.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/16
 */
//@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> selectList();
    @Select("select * from student where id={id}")
    Student selectId(Integer id);
    @Insert("insert into student values(null,#{name},#{age},#{gender})")
    int save(Student student);
    @Update("update student set name=#{name},age=#{age},gender=#{gender} where id=#{id}")
    int update(Student student);
    @Delete("delete from student where id=#{id}")
    int delete(Integer id);

}
