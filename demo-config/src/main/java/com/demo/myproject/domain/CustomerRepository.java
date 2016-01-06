package com.demo.myproject.domain;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by tianwen on 16/1/3.
 */
public class CustomerRepository {

    @Value("${customer}")
    private String customer;


    @Value("${status}")
    private String status;
    public Customer getCustomer(){

        Customer customer=new Customer();
        customer.setAge("30");

        customer.setName(this.customer);
        customer.setStatus(status);
        return customer;
    }

}
