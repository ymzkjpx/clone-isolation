package com.cloneisolation.domain.model.timecard.evalution;

import com.cloneisolation.domain.type.time.Minute;

public class NightBreakTime {
    Minute minute;

    @Deprecated
    NightBreakTime() {}

    public NightBreakTime(Minute minute) {
        this.minute = minute;
    }

    public Minute minute() {
        return minute;
    }

    public Minute from(String value) {
        return Minute.from(value);
    }

    @Override
    public String toString() {
        return "NightBreakTime{" + "minute=" + minute + '}';
    }
}
