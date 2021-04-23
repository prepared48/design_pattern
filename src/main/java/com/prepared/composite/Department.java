package com.prepared.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/22 17:44
 */
public class Department extends HumanResource {

    private List<HumanResource> subNodes = new ArrayList<>();

    public Department(long id) {
        super(id, true);
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0;
        for (HumanResource hr : subNodes) {
            totalSalary += hr.calculateSalary();
        }
        this.salary = totalSalary;
        return totalSalary;
    }

    public void addSubNodes(HumanResource hr) {
        subNodes.add(hr);
    }

    public List<Long> getDepartmentEmployeeIds(Long departmentId) {
        Department department = new Department(departmentId);
        List<Long> ids = new ArrayList<>();
        for (HumanResource hr : subNodes) {
            if (!department.isDepartment()) {
                ids.add(hr.getId());
            }
        }
        return ids;
    }

    public List<Long> getSubDepartmentIds(Department department) {
        List<Long> ids = new ArrayList<>();
        for (HumanResource hr : subNodes) {
            if (department.isDepartment()) {
                ids.add(hr.getId());
            }
        }
        return ids;
    }
}
