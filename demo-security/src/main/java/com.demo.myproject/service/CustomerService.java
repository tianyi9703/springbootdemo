package com.demo.myproject.service;

import com.demo.myproject.domain.CustomerRepository;
import com.demo.myproject.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Service;

/**
 * Created by tianwen on 16/1/3.
 */
@Service
@EnableGlobalMethodSecurity(securedEnabled = true)
public class CustomerService  {



    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerRepository customerRepository2;

    public Customer getCustomer(){
        return customerRepository.getCustomer();
    }





}
