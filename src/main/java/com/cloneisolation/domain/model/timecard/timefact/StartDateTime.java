package com.cloneisolation.domain.model.timecard.timefact;

import com.cloneisolation.domain.type.datetime.DateTime;
import com.cloneisolation.domain.type.time.Time;

import java.time.LocalDate;

public class StartDateTime {
    DateTime value;

    @Deprecated
    StartDateTime() {}

    public StartDateTime(DateTime value) {
        this.value = value;
    }

    public LocalDate date() {
        return value.date();
    }

    public Time time() {
        return value.time();
    }

    public DateTime value(){
        return value;
    }

    public boolean isAfter(DateTime other){
        return value.isAfter(other);
    }

    public boolean isBefore(DateTime other){
        return value.isBefore(other);
    }

    public boolean isAfter(StartDateTime other){
        return value.isAfter(other.value);
    }

    public boolean isAfter(EndDateTime other){
        return value.isBefore(other.value);
    }


    @Override
    public String toString() {
        return "StartDateTime{" + "value=" + value + '}';
    }
}
