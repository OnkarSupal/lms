package com.poc.lms.repository;

import com.poc.lms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.NamedQuery;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {


    //public Customer findByCustId();
}
