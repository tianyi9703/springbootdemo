package com.mogujie.myproject.service;

import com.mogujie.myproject.domain.Customer;
import com.mogujie.myproject.domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tianwen on 16/1/3.
 */
@Service
public class CustomerService {


    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerRepository customerRepository2;


    public Customer getCustomer(){
        return customerRepository.getCustomer();
    }

}
