package com.prepared.flyweight;

/**
 * 享元模式 在 Integer 中的应用
 *
 * @Author: zhongshibo
 * @Date: 2021/4/22 16:37
 */
public class TestFlyWeightInteger {

    public static void main(String[] args) {
        Integer i1 = 56;
        Integer i2 = 56;
        // 超过128
        Integer i3 = 129;
        Integer i4 = 129;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
    }
}
