package com.prepared.flyweight;

/**
 * 测试 内存分配
 *
 * @Author: zhongshibo
 * @Date: 2021/4/22 16:42
 */
public class TestAutoBox {

    public static void main(String[] args) {
        User a1 = new User(123, 23);
        User a2 = a1;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1 == a2);// true

        User a3 = new User(123, 23);
        User a4 = new User(123, 23);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a3 == a4); // false
    }
}
