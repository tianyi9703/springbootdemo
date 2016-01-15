package com.demo.myproject;

/**
 * Created by tianwen on 16/1/3.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@Configuration

@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(Application.class);
         app.run(args);
    }

}