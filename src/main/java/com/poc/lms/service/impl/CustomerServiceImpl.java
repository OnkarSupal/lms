package com.poc.lms.service.impl;

import com.poc.lms.exception.ResourceNotFoundException;
import com.poc.lms.model.Customer;
import com.poc.lms.repository.CustomerRepository;
import com.poc.lms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> getCustomers() {
        return customerRepository.findById(2L);
    }
}
