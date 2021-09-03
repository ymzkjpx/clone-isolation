package com.cloneisolation.presentation.controller.timecard;

public class EndMinutes {
    String value;

    EndMinutes() {}

    public EndMinutes(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EndMinutes{" + "value='" + value + '\'' + '}';
    }

    int toInt() {
        return Integer.parseInt(value);
    }
}
