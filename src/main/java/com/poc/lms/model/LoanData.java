package com.poc.lms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import javax.persistence.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "loans")
public class LoanData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "loan_amount")
    private double loanAmount;

    @Column(name = "loan_amount_due")
    private double loanAmountDue;

    @Column(name = "def_ind")
    private int defaultIndicator;

    @Column(name = "loan_status")
    private String loanStatus;

    @OneToOne(mappedBy = "loanData")
    private Customer customer;
}
