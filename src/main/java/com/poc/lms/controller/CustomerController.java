package com.poc.lms.controller;

import com.poc.lms.model.Customer;
import com.poc.lms.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer)
    {
        System.out.println("request body : ");
        System.out.println("customer : "+customer.toString());
        return new ResponseEntity<Customer>(customerService.saveCustomer(customer),HttpStatus.CREATED);
    }
/*
    @GetMapping("/list")
    public Optional<Customer> getCustomers()
    {
        return customerService.getCustomers();
    }*/
}

//api/customer/list