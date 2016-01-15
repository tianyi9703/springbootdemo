package com.demo.myproject.config;

import com.demo.myproject.domain.CustomerRepository;
import com.demo.myproject.filter.MyFilter;
import com.demo.myproject.interceptor.SystemInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

/**
 * Created by tianwen on 16/1/3.
 */
@Configuration
//@ImportResource({ "classpath*:spring/spring.xml"})
public class Config {


    @Bean
    public CustomerRepository customerRepository(){
        return new CustomerRepository();
    }


    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());

        registration.setDispatcherTypes(EnumSet.allOf(DispatcherType.class));
        return registration;
    }



    @Value("${tomcatport:8089}")
    private int port;
    @Bean
    public EmbeddedServletContainerFactory servletContainer() {

        return new TomcatEmbeddedServletContainerFactory(this.port);
    }
}
