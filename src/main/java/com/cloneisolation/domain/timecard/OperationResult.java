package com.cloneisolation.domain.timecard;

import com.cloneisolation.domain.employee.EmployeeId;

public class OperationResult {
    EmployeeId employeeId;
    String workerName;
    float hourlyWage;
    String relationShip;

    @Deprecated
    private OperationResult() {}

    public OperationResult(EmployeeId employeeId, String workerName, float hourlyWage, String relationShip) {
        this.employeeId   = employeeId;
        this.workerName   = workerName;
        this.hourlyWage   = hourlyWage;
        this.relationShip = relationShip;
    }

    public EmployeeId employeeId() {
        return employeeId;
    }

    public float hourlyWage() {
        return hourlyWage;
    }

    public Integer showEmployeeId() {
        return employeeId.value();
    }

    public String showWorkerName() {
        return "Dummy Name";
    }

    public float showHourlyWage() {
        return (float)1000.0;
    }

    public float showTotalWorkedTime() {
        return (float) 160.0;
    }

    public Integer showMonthlyWage() {
        return 50000;
    }

    public String showRelationShip() {
        return "正社員";
    }
}
