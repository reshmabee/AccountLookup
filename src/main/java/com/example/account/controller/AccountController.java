package com.example.account.controller;

import com.example.account.model.Account;
import com.example.account.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @Autowired
    private AccountRepo accountRepo;
    @GetMapping("/account")
    public Account account(@RequestHeader (name = "zip") String zip,
                           @RequestHeader (name = "last4CardNumber") String last4CardNumber,
                           @RequestHeader (name = "monthYearExpiry") String monthYearExpiry) {
        return accountRepo.getAccount();


    }




}
