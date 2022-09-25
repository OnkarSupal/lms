package com.poc.lms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import javax.persistence.*;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_mobile")
    private String userMobile;

    @OneToOne(mappedBy = "user")
    private Customer customer;
}
/*
{
    "custName" : "Onkar Supal",
    "custEmail" : "onkarsupal@gmail.com",
    "custMobile" : "9130308998",
    "loanData" :{
        "id" :1
    },
    "user" :{
        "id":1
    }
}
*/
