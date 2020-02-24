package com.example.hibernatetransactionslockstest.services;

import com.example.hibernatetransactionslockstest.entities.Account;
import com.example.hibernatetransactionslockstest.repositories.AccountRepository;
import com.example.hibernatetransactionslockstest.repositories.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    private final CustomerRepository customerRepository;
    private final AccountRepository accountRepository;

    public AccountService(CustomerRepository customerRepository, AccountRepository accountRepository) {
        this.customerRepository = customerRepository;
        this.accountRepository = accountRepository;
    }

    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public void updateAccount2RU() throws InterruptedException {
        Account a = accountRepository.findById(2).get();
        System.out.println("Account amount: " + a.getAmount());
        a.setAmount(a.getAmount()+1);
        accountRepository.save(a);
        Thread.currentThread().sleep(5000);
    }

    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public void update2Account2RU() throws InterruptedException {
        Account a = accountRepository.findById(2).get();
        System.out.println("Account amount: " + a.getAmount());
        a.setAmount(a.getAmount()+1);
        Thread.currentThread().sleep(5000);
    }

}
