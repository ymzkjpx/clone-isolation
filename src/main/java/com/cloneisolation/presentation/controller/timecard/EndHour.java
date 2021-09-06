package com.cloneisolation.presentation.controller.timecard;

public class EndHour {
    String value;

    EndHour() {}

    public EndHour(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EndHour{" + "value='" + value + '\'' + '}';
    }

    int toInt() {
        return Integer.parseInt(value);
    }
}
