package com.demo.myproject.config;

import com.demo.myproject.domain.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tianwen on 16/1/3.
 */
@Configuration
//@ImportResource({ "classpath*:spring/spring.xml"})
public class RepositoryConfig {


    @Bean
    public CustomerRepository customerRepository(){
        return new CustomerRepository();
    }


}
