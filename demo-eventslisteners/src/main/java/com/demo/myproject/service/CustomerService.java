package com.demo.myproject.service;

import com.demo.myproject.domain.Customer;
import com.demo.myproject.domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.boot.*;

/**
 * Created by tianwen on 16/1/3.
 */
@Service
public class CustomerService implements  CommandLineRunner{



    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerRepository customerRepository2;


    public Customer getCustomer(){
        return customerRepository.getCustomer();
    }


    public void run(String... args) {
        for(String arg:args){
            System.out.println("CommandLineRunner "+arg);
        }
        System.out.println("CommandLineRunner args length="+args.length);

        // Do something...
    }


}
