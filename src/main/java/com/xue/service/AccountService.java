package com.xue.service;

import com.xue.pojo.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    Account findById(Integer id);

}
