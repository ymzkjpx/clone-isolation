package com.cloneisolation.presentation.controller.timecard;

public class EndTime {
    EndHour endHour;
    EndMinutes endMinutes;

    EndTime() {}

    public EndTime(EndHour endHour, EndMinutes endMinutes) {
        this.endHour    = endHour;
        this.endMinutes = endMinutes;
    }

    @Override
    public String toString() {
        return "EndTime{" + "endHour=" + endHour + ", endMinutes=" + endMinutes + '}';
    }
}
