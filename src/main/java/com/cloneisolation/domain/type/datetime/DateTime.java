package com.cloneisolation.domain.type.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    LocalDateTime value;

    @Deprecated
    DateTime(){}

    public DateTime(LocalDateTime value) {
        this.value = value;
    }

    public LocalDate value(){
        return value;
    }

    public static DateTime parse(String date, String time){
        LocalDate d = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        LocalDate t = LocalDate.parse(time, DateTimeFormatter.ofPattern("H:m"));
        return new DateTime(LocalDateTime.of(d, t));
    }

    public static DateTime parse(String date, String hour, String minute){

    }
}
