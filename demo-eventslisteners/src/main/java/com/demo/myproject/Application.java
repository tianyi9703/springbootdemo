package com.demo.myproject;

/**
 * Created by tianwen on 16/1/3.
 */

import com.demo.myproject.event.ApplicationEnvironmentPreparedEventDemo;
import com.demo.myproject.event.EventDemo;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@Configuration

@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new EventDemo());
        app.addListeners(new ApplicationEnvironmentPreparedEventDemo());
        app.run(args);
    }

}