package com.prepared.composite;

import java.util.List;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/22 17:46
 */
public class Demo {

    private static final long ORGANIZATION_ROOT_ID = 1001;

    private Department department;

    private Employee employee;

    public void buildOrganization() {
        Department rootDepartment = new Department(ORGANIZATION_ROOT_ID);
        buildOrganization(rootDepartment);
    }

    private void buildOrganization(Department rootDepartment) {
        List<Long> subDepartmentIds = department.getSubDepartmentIds(department);
        for (Long subDepartmentId : subDepartmentIds) {
            Department subDepartment = new Department(subDepartmentId);
            department.addSubNodes(subDepartment);
            buildOrganization(subDepartment);
        }
        List<Long> employeeIds = employee.getDepartmentEmployeeIds(department.getId());
        for (Long employeeId : employeeIds) {
            double salary = employee.getEmployeeSalary(employeeId);
            department.addSubNodes(new Employee(employeeId, salary));
        }
    }
}
