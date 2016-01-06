package com.demo.myproject.domain;

import org.springframework.stereotype.Repository;

/**
 * Created by tianwen on 16/1/3.
 */
@Repository
public class CustomerRepository {


    public Customer getCustomer(){

        Customer customer=new Customer();
        customer.setAge("30");

        customer.setName("张三");
        return customer;
    }

}
