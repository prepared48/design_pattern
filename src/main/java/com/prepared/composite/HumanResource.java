package com.prepared.composite;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/22 17:40
 */
public abstract class HumanResource {

    protected long id;

    protected double salary;

    private boolean isDepartment;

    public HumanResource(long id) {
        this.id = id;
    }

    public HumanResource(long id, boolean isDepartment) {
        this.id = id;
        this.isDepartment = isDepartment;
    }

    public long getId() {
        return id;
    }

    public boolean isDepartment() {
        return isDepartment;
    }

    public abstract double calculateSalary();


}
