package com.prepared.factory;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/12 18:57
 */
public class BeanCreationFailureException extends RuntimeException {
    public BeanCreationFailureException(String s, ReflectiveOperationException e) {
        super(s, e);
    }
}
