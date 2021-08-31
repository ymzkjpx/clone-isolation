package com.cloneisolation.domain.employee;

public class Employee {
    EmployeeId employeeId;

    @Deprecated
    Employee(){}

    public Employee(EmployeeId id){
        this.employeeId = id;
    }

    public EmployeeId employeeId() {
        return employeeId;
    }


}
