package com.demo.myproject.domain;

/**
 * Created by tianwen on 16/1/3.
 */
public class CustomerRepository {


    public Customer getCustomer(){

        Customer customer=new Customer();
        customer.setAge("30");

        customer.setName("张三");
        return customer;
    }

}
