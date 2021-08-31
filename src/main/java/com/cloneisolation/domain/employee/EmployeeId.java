package com.cloneisolation.domain.employee;

public class EmployeeId {
    Integer value;

    @Deprecated
    EmployeeId(){}

    public EmployeeId(Integer value){
        this.value = value;
    }

    public Integer value(){
        return value;
    }

    @Override
    public String toString() {
        return "EmployeeId{" + "value=" + value + '}';
    }
}
