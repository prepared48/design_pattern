package com.prepared.observer;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: zhongshibo
 * @Date: 2020/7/15 15:27
 */

// Event事件
public class DemoEvent extends ApplicationEvent {

    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
    }

    public String getMessage() {
        return this.message;
    }
}


