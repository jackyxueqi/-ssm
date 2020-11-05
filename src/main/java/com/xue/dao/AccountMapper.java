package com.xue.dao;

import com.xue.pojo.Account;

import java.util.List;

public interface AccountMapper {

    List<Account> findAll();

    Account findById(Integer id);
}
