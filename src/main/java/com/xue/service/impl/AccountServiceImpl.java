package com.xue.service.impl;

import com.xue.dao.AccountMapper;
import com.xue.pojo.Account;
import com.xue.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> findAll() {

        List<Account> accountList = accountMapper.findAll();
        return accountList;
    }

    @Override
    public Account findById(Integer id) {

        Account account = accountMapper.findById(id);
        return account;
    }
}
