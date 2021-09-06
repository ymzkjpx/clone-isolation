package com.cloneisolation.domain.model.timecard.evalution;

import com.cloneisolation.domain.type.time.Minute;

public class BreakTime {
    Minute value;

    @Deprecated
    BreakTime() {}

    public BreakTime(Minute value) {
        this.value = value;
    }

    public BreakTime(DaytimeBreakTime daytimeBreakTime, NightBreakTime nightBreakTime) {
        this(daytimeBreakTime.minute.add(nightBreakTime.minute));
    }

    @Override
    public String toString() {
        return "BreakTime{" + "value=" + value + '}';
    }
}
