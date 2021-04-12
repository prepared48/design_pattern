package com.prepared.factory;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/12 16:11
 */
public interface ApplicationContext {

    Object getBean(String beanId);
}
