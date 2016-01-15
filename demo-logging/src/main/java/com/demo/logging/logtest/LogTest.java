package com.demo.logging.logtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.logging.logback.LevelRemappingAppender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tianwen on 16/1/10.
 */
@Configuration
public class LogTest {
    public final static Logger log = LoggerFactory.getLogger(LogTest.class);

    @Bean
    public Demo getDemo() {
        Demo d = new Demo();
        log.debug("LogTest-debug");
        log.error("LogTest-error");
        log.info("LogTest-info");
        log.warn("LogTest-warn");

        return d;

    }
}

class Demo {

}


