package com.cloneisolation.domain.model.timecard.evalution;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class WorkDate {
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate value;

    @Deprecated
    WorkDate(){}

    public WorkDate(LocalDate value) {
        this.value = value;
    }

    public LocalDate value(){
        return value;
    }

    @Override
    public String toString() {
        return "WorkDate{" + "value=" + value + '}';
    }
}
