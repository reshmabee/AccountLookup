package com.example.account.repository;

import com.example.account.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountRepo {
    public Account getAccount(){
        return new Account();
    }
}
