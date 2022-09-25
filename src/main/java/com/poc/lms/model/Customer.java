package com.poc.lms.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Table(name = "customers")
//@NamedQuery(name = "Customer.findAll",query = "select * from customers where id=2")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_email")
    private String custEmail;

    @Column(name = "cust_mobile")
    private String custMobile;


    @OneToOne
    private User user;

    @OneToOne
    private LoanData loanData;

}
