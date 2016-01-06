package com.demo.myproject.event;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by tianwen on 16/1/5.
 */
public class ApplicationEnvironmentPreparedEventDemo  implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {



    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("初始化context之前Environment之后加载:"+event.getEnvironment().getProperty("domain"));
    }
}
