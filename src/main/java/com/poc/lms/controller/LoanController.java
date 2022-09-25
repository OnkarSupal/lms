package com.poc.lms.controller;

import com.poc.lms.model.Customer;
import com.poc.lms.model.Loan;
import com.poc.lms.service.LoanService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("api/loan")
public class LoanController {

    LoanService loanService;

    public LoanController(LoanService loanService) {
        super();
        this.loanService = loanService;
    }

    @GetMapping("/getAllLoans")
    public List<Loan> getCustomers()
    {

        return loanService.getAllLoans();
    }
}
