package com.prepared.decorator;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/13 17:45
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
