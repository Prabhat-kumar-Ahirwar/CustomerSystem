package com.example.CustomerSystem.controller;

import com.example.CustomerSystem.Entity.customer;
import com.example.CustomerSystem.repository.CustomerRepository;
import com.example.CustomerSystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @PostMapping("/add")
    public customer saveCustomer(@RequestBody customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/allCustomer")
    public List<customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }
    @GetMapping("/{customerId}")
    public customer getCustomerById(@PathVariable int customerId) {
        return customerService.getCustomerById(customerId);
    }
    @DeleteMapping("/{customerId}")
    public String deleteById(@PathVariable int customerId){
        return customerService.deleteById(customerId);
    }
    @PutMapping("/{customerId}")
    public String updateCustomer(
            @PathVariable int customerId,
            @RequestBody customer customer) {

        return customerService.updateCustomer(customerId, customer);
    }
}



