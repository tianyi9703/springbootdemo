package com.demo.myproject.service;

import com.demo.myproject.domain.Customer;
import com.demo.myproject.domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tianwen on 16/1/3.
 */
@Service
public class CustomerService {


    @Autowired
    CustomerRepository customerRepository;



    public Customer getCustomer(){
        return customerRepository.getCustomer();
    }

}
