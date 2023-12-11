package com.mindhub.homebanking.dto;

import com.mindhub.homebanking.models.Account;

import java.time.LocalDate;
import java.util.List;

public class AccountDTO {
    private Long id;


    private String number;
    private LocalDate creationDate;
    private double balance;

    public AccountDTO(Account account){
        id=account.getId();
        number=account.getNumber();
        creationDate=account.getCreationDate();
        balance= account.getBalance();


    }

    public Long getId() {
        return id;
    }



    public String getNumber() {
        return number;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public double getBalance() {
        return balance;
    }
}
