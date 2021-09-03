package com.cloneisolation.presentation.controller.timecard;

public class StartMinutes {
    String value;

    StartMinutes() {}

    public StartMinutes(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StartMinutes{" + "value='" + value + '\'' + '}';
    }

    int toInt() {
        return Integer.parseInt(value);
    }
}
