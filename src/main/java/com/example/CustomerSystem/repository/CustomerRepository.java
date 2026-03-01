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

    public List<customer> getAllCustomer(){
        return list;
    }
    public customer getCustomerById(int id) {
        for (customer customer : list) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null; // if not found
    }

    public String delete(int customerId) {
        boolean removed = list.removeIf(customer -> customer.getId() == customerId);

        if (removed) {
            return "Deleted";
        } else {
            return "Customer Not Found";
        }
    }
    public String update(int customerId, customer updatedCustomer) {

        for (customer customer : list) {

            if (customer.getId() == customerId) {

                customer.setName(updatedCustomer.getName());
                customer.setAge(updatedCustomer.getAge());
                customer.setAddress(updatedCustomer.getAddress());

                return "Customer Updated Successfully";
            }
        }

        return "Customer Not Found";
    }

}