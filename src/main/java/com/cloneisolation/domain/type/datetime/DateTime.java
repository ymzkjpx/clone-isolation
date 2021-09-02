package com.cloneisolation.domain.type.datetime;

import com.cloneisolation.domain.type.time.Minute;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {
    LocalDateTime value;

    @Deprecated
    DateTime(){}

    public DateTime(LocalDateTime value) {
        this.value = value;
    }

    public LocalDateTime value(){
        return value;
    }

    public static DateTime parse(String date, String time){
        LocalDate d = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        LocalTime t = LocalTime.parse(time, DateTimeFormatter.ofPattern("H:m"));
        return new DateTime(LocalDateTime.of(d, t));
    }

    public static DateTime parse(String date, String hour, String minute){
        return parse(date, (hour + ":" + minute));
    }

    public boolean isAfter(DateTime ohter){
        return value.isAfter(ohter.value);
    }

    public boolean isBefore(DateTime other){
        return value.isBefore(other.value);
    }
}
