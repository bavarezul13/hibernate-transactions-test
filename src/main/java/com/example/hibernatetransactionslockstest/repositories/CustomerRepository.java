package com.example.hibernatetransactionslockstest.repositories;

import com.example.hibernatetransactionslockstest.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
