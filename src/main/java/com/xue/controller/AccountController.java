package com.xue.controller;

import com.xue.pojo.Account;
import com.xue.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/showAccount/{id}")
    public String findById(@PathVariable("id") Integer id, Model model) {

        Account account = accountService.findById(1);
        model.addAttribute("account", account);
        return "account";
    }

}
