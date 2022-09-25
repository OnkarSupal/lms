package com.poc.lms.service;

import com.poc.lms.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    Optional<Customer> getCustomers();

}
