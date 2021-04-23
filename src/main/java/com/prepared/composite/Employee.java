package com.prepared.composite;

import java.util.List;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/22 17:43
 */
public class Employee extends HumanResource {

    public Employee(long id) {
        super(id, false);
    }

    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    public List<Long> getDepartmentEmployeeIds(long id) {
        Department department = new Department(id);
        // 本部门的员工
        List<Long> departmentEmployeeIds = department.getDepartmentEmployeeIds(id);
        List<Long> subDepartmentIds = department.getSubDepartmentIds(department);
        for (Long departmentId : subDepartmentIds) {
            Department department1 = new Department(departmentId);
            if (department1.isDepartment()) {
                departmentEmployeeIds.addAll(department1.getDepartmentEmployeeIds(departmentId));
            }
        }
        return departmentEmployeeIds;
    }

    public double getEmployeeSalary(Long employeeId) {
        return new Employee(employeeId).salary;
    }
}
