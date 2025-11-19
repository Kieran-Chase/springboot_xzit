package com.xzit;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xzit.entity.Goods;
import com.xzit.enums.StatusEnum;
import com.xzit.mapper.GoodsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/19
 */
@SpringBootTest
public class TestPrimaryKey {
    @Resource
    private GoodsMapper mapper;

    @Test
    public void save(){
        Goods goods=new Goods();
        goods.setName("商品1");
        mapper.insert(goods);
    }

    @Test
    public void update(){
        Goods goods = new Goods();
        goods.setId(7);
        goods.setName("商品3");
        mapper.updateById(goods);
    }

    @Test
    public void testEnum(){
        Goods goods = new Goods();
        goods.setName("商品3");
        goods.setStatus(StatusEnum.IN);
        mapper.insert(goods);
    }

    @Test
    public void selectEnum(){
        List<Goods> goods = mapper.selectList(null);
        goods.forEach(System.out::println);
    }

    @Test
    public void selectEnumCondition(){
        QueryWrapper<Goods> wrapper=new QueryWrapper<>();
        wrapper.eq("status",StatusEnum.IN);
        List<Goods> goods = mapper.selectList(wrapper);
        goods.forEach(System.out::println);
    }
}
