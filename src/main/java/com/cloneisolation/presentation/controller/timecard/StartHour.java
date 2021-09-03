package com.cloneisolation.presentation.controller.timecard;

public class StartHour {
    String value;

    StartHour() {}

    public StartHour(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StartHour{" + "value='" + value + '\'' + '}';
    }

    int toInt() {
        return Integer.parseInt(value);
    }
}
