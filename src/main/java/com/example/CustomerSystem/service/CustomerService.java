package com.example.CustomerSystem.service;

import com.example.CustomerSystem.Entity.customer;
import com.example.CustomerSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private static CustomerRepository customerRepository;

    public static customer saveCustomer(customer customer) {
        return customerRepository.save(customer);
    }


}
