package com.cloneisolation.presentation.controller.timecard;

public class StartTime {
    StartHour hour;
    StartMinutes startMinutes;

    @Deprecated
    StartTime() {}

    public StartTime(StartHour hour, StartMinutes startMinutes) {
        this.hour         = hour;
        this.startMinutes = startMinutes;
    }

    @Override
    public String toString() {
        return "StartTime{" + "hour=" + hour + ", startMinutes=" + startMinutes + '}';
    }
}
