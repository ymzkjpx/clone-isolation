package com.cloneisolation.domain.model.timecard.evalution;

import com.cloneisolation.domain.type.time.Minute;

public class DaytimeWorkTime {
    Minute value;

    @Deprecated
    DaytimeWorkTime() {}

    public DaytimeWorkTime(Minute value) {
        this.value = value;
    }

    public DaytimeWorkTime(int value) {
        this.value = new Minute(value);
    }

    public Minute minute() {
        return value;
    }

    @Override
    public String toString() {
        return "DaytimeWorkTime{" + "value=" + value + '}';
    }
}
