package com.cloneisolation.domain.type.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    LocalTime value;

    @Deprecated
    Time(){}

    public Time(LocalTime time) {
        this.value = time;
    }

    public Time(Integer hour, Integer minute){
        this(LocalTime.of(hour, minute))
    }

    public Time(String hour, String minute){
        this(Integer.parseInt(hour), Integer.parseInt(minute));
    }

    public Time(String testTime){
        this(LocalTime.parse(testTime, DateTimeFormatter.ofPattern("H:m")));
    }

    public LocalTime value(){
        return value;
    }

    public boolean isAfter(Time other){
        return value.isAfter(other.value);
    }

    public boolean isBefore(Time other){
        return value.isBefore(other.value);
    }


    @Override
    public String toString() {
        return "Time{" + "value=" + value + '}';
    }
}
