package com.demo.myproject;

/**
 * Created by tianwen on 16/1/3.
 */

import com.demo.myproject.interceptor.SystemInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@Configuration

@EnableAutoConfiguration
@ComponentScan
public class Application extends WebMvcConfigurerAdapter
{
    /**
     * 配置拦截器
     * @param registry
     */
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SystemInterceptor()).addPathPatterns("/web/**");
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);


        app.run(args);


    }

}