package com.poc.lms.service.impl;


import com.poc.lms.model.Customer;
import com.poc.lms.model.Loan;
import com.poc.lms.repository.LoanRepository;
import com.poc.lms.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanSeviceImpl implements LoanService {
    @Autowired
    LoanRepository loanRepository;

    @Override
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }
}
