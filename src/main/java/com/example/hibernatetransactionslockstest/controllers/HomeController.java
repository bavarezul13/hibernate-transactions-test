package com.example.hibernatetransactionslockstest.controllers;

import com.example.hibernatetransactionslockstest.services.AccountService;
import com.example.hibernatetransactionslockstest.services.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final AccountService accountService;
    private final CustomerService customerService;

    public HomeController(AccountService accountService, CustomerService customerService) {
        this.accountService = accountService;
        this.customerService = customerService;
    }

    @GetMapping("/updateAccount2RU")
    public String updateAccount2RU() throws InterruptedException {
        accountService.updateAccount2RU();
        return "done!";
    }

    @GetMapping("/update2Account2RU")
    public String update2Account2RU() throws InterruptedException {
        accountService.update2Account2RU();
        return "done!";
    }

    @GetMapping("/updateAccount2RC")
    public String updateAccount2RC() {
        updateAccount2RC();
        return "done!";
    }

    @GetMapping("/update2Account2RC")
    public String update2Account2RC() {
        update2Account2RC();
        return "done!";
    }

    /*@GetMapping("/populateDb")
    public String populateDb() {
        Customer c1 = new Customer("Dani");
        Account a1 = new Account(100);
        Account a2 = new Account(50);
        c1.addAccount(a1);
        c1.addAccount(a2);

        Customer c2 = new Customer("Marius");
        Account a3 = new Account(40);
        Account a4 = new Account(30);
        c2.addAccount(a3);
        c2.addAccount(a4);

        customerRepository.saveAll(Arrays.asList(c1, c2));
        return "done!";
    }*/
}
