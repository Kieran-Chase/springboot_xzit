package com.xzit;

import com.xzit.entity.Bank;
import com.xzit.mapper.BankMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author Kieran_Chase
 * @project springboot_xzit
 * @date 2025/11/20
 */
@SpringBootTest
public class TestLock {

    @Resource
    private BankMapper bankMapper;

    @Test
    public void testUpdate(){
        Bank bank = bankMapper.selectById(1);
        bank.setMoney(bank.getMoney()+500);
        bankMapper.updateById(bank);
    }
}
