package com.prepared.flyweight;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/22 16:41
 */
public class User {

    private int id;

    private int age;

    public User(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
