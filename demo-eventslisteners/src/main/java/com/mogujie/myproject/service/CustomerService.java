package com.mogujie.myproject.service;

import com.mogujie.myproject.domain.Customer;
import com.mogujie.myproject.domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.boot.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import java.util.List;

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
