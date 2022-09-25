package com.poc.lms.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "VW_LOAN_DATA")
public class Loan {
    @Id
    @Column(name = "loan_id")
    long loan_id;
    @Column(name = "cust_name")
    String cust_name;
    @Column(name = "cust_email")
    String cust_email;
    @Column(name = "cust_mobile")
    String cust_mobile;
    @Column(name = "loan_amount")
    double loan_amount;
    @Column(name = "loan_amount_due")
    double loan_amount_due;
    @Column(name = "loan_status")
    String loan_status;
    @Column(name = "def_ind")
    int def_ind;
}
