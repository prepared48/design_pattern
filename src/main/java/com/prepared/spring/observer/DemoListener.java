package com.prepared.spring.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// Listener监听者
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String message = demoEvent.getMessage();
        System.out.println(message);
    }
}