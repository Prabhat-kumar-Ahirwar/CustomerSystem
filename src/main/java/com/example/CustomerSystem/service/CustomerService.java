package com.example.CustomerSystem.service;

import com.example.CustomerSystem.Entity.customer;
import com.example.CustomerSystem.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    // Constructor Injection (Best Practice)
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String deleteById(int customerId) {
        return customerRepository.delete(customerId);
    }

    public customer saveCustomer(customer customer) {
        return customerRepository.save(customer);
    }

    public List<customer> getAllCustomer() {
        return customerRepository.getAllCustomer();
    }
    public customer getCustomerById(int customerId) {
        return customerRepository.getCustomerById(customerId);
    }
    public String updateCustomer(int customerId, customer customer) {
        return customerRepository.update(customerId, customer);
    }
}