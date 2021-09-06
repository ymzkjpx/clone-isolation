package com.cloneisolation.domain.model.timecard.timefact;

import com.cloneisolation.domain.type.datetime.DateTime;
import com.cloneisolation.domain.type.time.Time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class EndDateTime {
    DateTime value;

    @Deprecated
    EndDateTime() {}

    public EndDateTime(DateTime value) {
        this.value = value;
    }

    public LocalDate localDate() {
        return value.value()
                    .toLocalDate();
    }

    public DateTime value(){
        return value;
    }

    String clockTimeTextOverDays(int days) {
        LocalTime localTime = value.time()
                                   .value();
        Duration duration = Duration.ofDays(days)
                                    .plusHours(localTime.getHour())
                                    .plusMinutes(localTime.getMinute());
        return String.format("%02d:%02d", duration.toHours(), duration.toMinutesPart());
    }

    public String endTimeTextWith(StartDateTime startDateTime) {
        Period period = startDateTime.value.date()
                                           .until(value.date());
        return clockTimeTextOverDays(period.getDays());
    }

    public Time time() {
        return value.time();
    }

    public boolean isAfter(DateTime other) {
        return value.isAfter(other);
    }

    public boolean isBefore(DateTime other) {
        return value.isBefore(other);
    }

    public boolean isBefore(StartDateTime other) {
        return value.isAfter(other.value);
    }

    public boolean isBefore(EndDateTime other) {
        return value.isBefore(other.value);
    }

    @Override
    public String toString() {
        return "EndDateTime{" + "value=" + value + '}';
    }
}
