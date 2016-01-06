package com.mogujie.myproject.event;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * ApplicationStartedEvent启动前做些什么
        * Created by tianwen on 16/1/5.
 */
public class EventDemo implements ApplicationListener<ApplicationStartedEvent> {


    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {

        System.out.println("初始化application之前加载。。。。");


    }
}
