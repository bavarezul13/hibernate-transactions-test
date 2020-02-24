package com.example.hibernatetransactionslockstest.services;

import com.example.hibernatetransactionslockstest.repositories.AccountRepository;
import com.example.hibernatetransactionslockstest.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final AccountRepository accountRepository;

    public CustomerService(CustomerRepository customerRepository, AccountRepository accountRepository) {
        this.customerRepository = customerRepository;
        this.accountRepository = accountRepository;
    }
}
