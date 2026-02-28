package com.example.CustomerSystem.repository;

import com.example.CustomerSystem.Entity.customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerRepository {

    private final List<customer> list = new ArrayList<>();

    public customer save(customer customer) {

        customer c = new customer();
        c.setId(customer.getId());
        c.setName(customer.getName());
        c.setAge(customer.getAge());
        c.setAddress(customer.getAddress());

        list.add(c);
        return c;
    }
}
