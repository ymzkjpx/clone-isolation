package com.cloneisolation.domain.type.datetime;

import com.cloneisolation.domain.type.time.Minute;
import com.cloneisolation.domain.type.time.Time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    LocalDateTime value;

    @Deprecated
    DateTime() {}

    public DateTime(LocalDateTime value) {
        this.value = value;
    }

    public LocalDateTime value() {
        return value;
    }

    public LocalDate date() {
        return value.toLocalDate();
    }

    public static DateTime parse(String date, String time) {
        LocalDate d = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        LocalTime t = LocalTime.parse(time, DateTimeFormatter.ofPattern("H:m"));
        return new DateTime(LocalDateTime.of(d, t));
    }

    public static DateTime parse(String date, String hour, String minute) {
        return parse(date, (hour + ":" + minute));
    }


    public Time time() {
        return new Time(value.toLocalTime());
    }

    public static Minute between(DateTime start, DateTime end) {
        Duration duration = Duration.between(start.value, end.value);
        return new Minute((int) duration.toMinutes());
    }

    public boolean isAfter(DateTime other) {
        return value.isAfter(other.value);
    }

    public boolean isBefore(DateTime other) {
        return value.isBefore(other.value);
    }
}
