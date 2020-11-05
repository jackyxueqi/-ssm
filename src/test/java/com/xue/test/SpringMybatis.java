package com.xue.test;

import com.xue.pojo.Account;
import com.xue.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applacationContext-dao.xml", "classpath*:applacationContext-service.xml"})
public class SpringMybatis {

    @Autowired
    private AccountService accountService;

    @Test
    public void test1() {

        List<Account> accountList = accountService.findAll();
        System.out.println(accountList);
    }
}
