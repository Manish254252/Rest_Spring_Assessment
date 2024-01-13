package com.example.HikeOn.service;

import com.example.HikeOn.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);

    List<Customer> getAllCustomers();
    // Other methods as needed
}
