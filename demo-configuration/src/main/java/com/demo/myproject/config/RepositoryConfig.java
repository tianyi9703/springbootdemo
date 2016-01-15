package com.demo.myproject.config;

import com.demo.myproject.domain.CustomerRepository;
import org.springframework.boot.logging.logback.LevelRemappingAppender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by tianwen on 16/1/3.
 */
@Configuration
@ImportResource({ "classpath*:spring/spring.xml"})
public class RepositoryConfig {


    @Bean
     public CustomerRepository customerRepository(){
        return new CustomerRepository();
    }


    public LevelRemappingAppender levelRemappingAppender(){
        LevelRemappingAppender levelRemappingAppender=new LevelRemappingAppender();
        levelRemappingAppender.setDestinationLogger("com.logtest");
        levelRemappingAppender.setRemapLevels("INFO->DEBUG,ERROR->WARN");
        return levelRemappingAppender;

    }


}
