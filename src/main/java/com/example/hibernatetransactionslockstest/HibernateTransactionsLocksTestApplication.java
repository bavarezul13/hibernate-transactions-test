package com.example.hibernatetransactionslockstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class HibernateTransactionsLocksTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateTransactionsLocksTestApplication.class, args);
	}

}
