package com.example.account.controller;

import com.example.account.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @GetMapping("/account")
    public Account account(@RequestHeader (name = "zip") String zip,
                           @RequestHeader (name = "last4CardNumber") String last4CardNumber,
                           @RequestHeader (name = "monthYearExpiry") String monthYearExpiry) {
        return new Account();


    }




}
