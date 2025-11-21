package com.xzit.gene.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xzit.gene.entity.Emp;
import com.xzit.gene.service.IEmpService;
import com.xzit.gene.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Kieran
 * @since 2025-11-21
 */
@RestController
@RequestMapping("/gene/emp")
@Api(tags = "员工管理 ")
public class EmpController {
    @Resource
    private IEmpService service;
    @ApiOperation("查询全部数据")
    @GetMapping
    public Result select(){
        List<Emp> list=service.testSelect();//service.list();
/*HashMap<String,Object> map=new HashMap<>();
map.put("list",list);*/
        return Result.success().setData("list",list);
    }
    @ApiOperation("按给定ID查询数据")
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Long id){
        Emp emp = service.getById(id);
        return Result.success().setData("emp",emp);
    }
    @ApiOperation("分页查询数据")
    @GetMapping("/{current}/{size}")
    public Result selectPage(@PathVariable int current,@PathVariable int
            size){
        Page<Emp> page=new Page<>(current,size);
        service.page(page);
        return Result.success().setData("page",page);
    }
    @ApiOperation("保存员工")
    @PostMapping
    public Result save(@RequestBody Emp emp){
        return service.save(emp)?Result.success():Result.error();
    }
    @ApiOperation("更新员工")
    @PutMapping
    public Result update(@RequestBody Emp emp){
        return service.updateById(emp)?Result.success():Result.error();
    }
    @ApiOperation("删除员工")
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){
        return service.removeById(id)?Result.success():Result.error();
    }
}
