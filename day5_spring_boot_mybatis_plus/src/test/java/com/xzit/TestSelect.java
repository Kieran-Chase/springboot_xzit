package com.xzit;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xzit.entity.Student;
import com.xzit.entity.Teacher;
import com.xzit.mapper.StudentMapper;
import com.xzit.mapper.TeacherMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/18
 */
@SpringBootTest
public class TestSelect {
    @Resource
    private TeacherMapper mapper;

    @Resource
    private StudentMapper studentMapper;

    @Test
    public void SelectById(){
        Teacher teacher = mapper.selectById(1);
        System.out.println(teacher);
    }

    @Test
    public void selectByIds(){
        List<Teacher> teachers=mapper.selectBatchIds(Arrays.asList(1,2));
        teachers.forEach(System.out::println);
    }

    @Test
    public void selectByMap(){
        Map<String,Object> map=new HashMap<>();
        map.put("teacher_name","李四");
        map.put("gender","女");
        List<Teacher> teachers = mapper.selectByMap(map);
        teachers.forEach(System.out::println);
    }

    @Test
    public void selectOne(){
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();
        wrapper.eq("teacher_name","张三");
        Teacher teacher = mapper.selectOne(wrapper);
        System.out.println(teacher);
    }

    @Test
    public void exists() {
        //判断给定条件的数据在数据库中是否存在
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();
        wrapper.eq("teacher_name", "张");
        boolean exists = mapper.exists(wrapper);
        System.out.println(exists);
    }

    @Test
    public void count() {
        //统计按给定条件查询到的记录数
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();
        wrapper.like("teacher_name", "张");
        Long aLong = mapper.selectCount(wrapper);
        System.out.println("aLong = " + aLong);
    }

    //查询结果以Map来封装
    @Test
    public void selectMaps(){
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();
        wrapper.like("teacher_name", "张");
        List<Map<String, Object>> list = mapper.selectMaps(wrapper);
        /*for (Map<String, Object> map : list) {
        for (String key:map.keySet()){
        System.out.println(key+"\t"+map.get(key));
        }
        }*/
        list.forEach(map->map.forEach((key,value)->
                System.out.println(key+"\t"+value)));
    }

    @Test
    public void selectObjs(){
        //只返回第一个字段的值
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();
        wrapper.like("teacher_name", "张");
        List<Object> objects = mapper.selectObjs(wrapper);
        objects.forEach(System.out::println);
    }

    @Test
    public void selectList(){
        //查询全部数据，返回List<Teacher>
        List<Teacher> teachers = mapper.selectList(null);
        teachers.forEach(System.out::println);
    }

    @Test
    public void selectList_1(){
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();
        wrapper.like("teacher_name","张")
                .eq("gender","女");
        List<Teacher> teachers = mapper.selectList(wrapper);
        teachers.forEach(System.out::println);
    }

    @Test
    public void selectList_2(){
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();
        wrapper.like("teacher_name","张")
                .or()
                .eq("gender","女");
        List<Teacher> teachers = mapper.selectList(wrapper);
        teachers.forEach(System.out::println);
    }

    @Test
    public void selectList_3() {
        //查询姓张，并且性别是女，或者年龄大于23的数据
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();
        wrapper.likeRight("teacher_name", "张")
                .eq("gender", "女")
                .or()
                .gt("age", 23);
        List<Teacher> teachers = mapper.selectList(wrapper);
        teachers.forEach(System.out::println);
    }
    @Test
    public void selectList_4() {
        //查询姓张，并且(性别是女，或者年龄大于23)的数据
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();
        wrapper.likeRight("teacher_name", "张")
                .and(i -> i.eq("gender", "女").or()
                        .gt("age", 23));
        List<Teacher> teachers = mapper.selectList(wrapper);
        teachers.forEach(System.out::println);
    }

    @Test
    public void selectListOrderBy(){
        //做查询排序
        QueryWrapper<Teacher> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("age")
                .orderByAsc("id");
        List<Teacher> teachers = mapper.selectList(wrapper);
        teachers.forEach(System.out::println);
    }

    @Test
    public void selectSub(){
        //可以实现子查询
        //修改了student表，加入tid字段，做关联
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.inSql("tid","select id from teacher where teacher_name='张三'");
        List<Student> students = studentMapper.selectList(wrapper);
        students.forEach(System.out::println);
    }

    @Test
    public void selectPage(){
        Page<Student> page=new Page<>(2,5);
        studentMapper.selectPage(page,null);
        System.out.println("总记录数："+page.getTotal()+"\t总页数"+page.getPages()
                        +"\t当前页:"+page.getCurrent()+"\t每页显示"+page.getSize()+"条数据\t"
                        +"是否有上一页:"+page.hasPrevious()+"\t是否有下一页:"+page.hasNext());

    }

    @Test
    public void selectMapsPage(){
        Page<Map<String, Object>> page=new Page<>(1,5);
        QueryWrapper<Student> queryWrapper=new QueryWrapper<>();
        queryWrapper.likeRight("name","李");
        studentMapper.selectMapsPage(page,queryWrapper);
        List<Map<String, Object>> records = page.getRecords();
        records.forEach(map->map.forEach((key,value)->
                System.out.println(key+"\t"+value)));
        System.out.println("总记录数："+page.getTotal()+"\t总页数"+page.getPages()
                        +"\t当前页:"+page.getCurrent()+"\t每页显示"+page.getSize()+"条数据\t"
                        +"是否有上一页:"+page.hasPrevious()+"\t是否有下一页:"+page.hasNext());
    }

    @Test
    public void selectCustomer(){
        List<Student> list=studentMapper.selectCustomer();
        list.forEach(System.out::println);
    }

    @Test
    public void selectCustomerPage(){
        Page<Student> page=new Page<>(1,5);
        studentMapper.selectCustomerPage(page,50);
        List<Student> records = page.getRecords();
        records.forEach(System.out::println);
        System.out.println("总记录数："+page.getTotal()+"\t总页数"+page.getPages()
                        +"\t当前页:"+page.getCurrent()+"\t每页显示"+page.getSize()+"条数据\t"
                        +"是否有上一页:"+page.hasPrevious()+"\t是否有下一页:"+page.hasNext());
    }

}
