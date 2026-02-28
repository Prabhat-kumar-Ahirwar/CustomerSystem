package com.example.CustomerSystem.controller;

import com.example.CustomerSystem.Entity.customer;
import com.example.CustomerSystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    private CustomerService customerService;
    @PostMapping("/add")
    public customer addCustomer(@RequestBody customer customer){
        return CustomerService.saveCustomer(customer);
    }
    @GetMapping("/allCustomer")
    public List<customer> getAllCustomer(){
        return CustomerService.getAllCustomer();
    }
    @GetMapping("/{Customerid}")
    public List<customer> getCustomerbyId(@PathVariable int customerId){
        return CustomerService.findById(customerId);
    }
    @DeleteMapping("/{deleteById}")
    public String deleteById(@PathVariable int customerId){
        deleteById(customerId);
        return "Customer Deleted Successfully";
    }



}
