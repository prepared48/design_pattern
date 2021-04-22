package com.prepared.flyweight;

/**
 * 享元模式 在 String 中的应用
 *
 * @Author: zhongshibo
 * @Date: 2021/4/22 16:37
 */
public class TestFlyWeightString {

    public static void main(String[] args) {
        // 字符串常量池 缓存常量
        String s1 = "小争哥";
        String s2 = "小争哥";
        String s3 = new String("小争哥");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s1 == s2);// true
        System.out.println(s1 == s3);// false
    }
}
