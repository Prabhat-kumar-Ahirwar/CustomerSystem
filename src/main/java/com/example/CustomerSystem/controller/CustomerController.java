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

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public customer saveCustomer(@RequestBody customer customer) {
        return repository.save(customer);
    }
}
//    }
//    @GetMapping("/allCustomer")
//    public List<customer> getAllCustomer(){
//        return CustomerService.getAllCustomer();
//    }
//    @GetMapping("/{Customerid}")
//    public List<customer> getCustomerbyId(@PathVariable int customerId){
//        return CustomerService.findById(customerId);
//    }
//    @DeleteMapping("/{deleteById}")
//    public String deleteById(@PathVariable int customerId){
//        deleteById(customerId);
//        return "Customer Deleted Successfully";
//    }
//


