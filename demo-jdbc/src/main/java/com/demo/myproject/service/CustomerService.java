package com.demo.myproject.service;

import com.demo.myproject.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by tianwen on 16/1/3.
 */
@Service
public class CustomerService  {



    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public   List<Map<String, Object>>  getCustomer(){
        List<Map<String, Object>> result= jdbcTemplate.queryForList("select * from StoreUser");


        return result;
    }





}
