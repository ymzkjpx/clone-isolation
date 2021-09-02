package com.cloneisolation.domain.model.employee;

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

    public EmployeeId from(String value){
        return new EmployeeId(Integer.parseInt(value));
    }

    @Override
    public String toString() {
        return "EmployeeId{" + "value=" + value + '}';
    }
}
