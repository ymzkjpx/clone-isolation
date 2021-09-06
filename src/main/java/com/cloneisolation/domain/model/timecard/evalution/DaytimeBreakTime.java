package com.cloneisolation.domain.model.timecard.evalution;

import com.cloneisolation.domain.type.time.Minute;

import javax.validation.constraints.Min;

public class DaytimeBreakTime {
    Minute minute;

    @Deprecated
    DaytimeBreakTime() {}

    public DaytimeBreakTime(Minute minute) {
        this.minute = minute;
    }

    public static Minute from(String value) {
        return Minute.from(value);
    }
}
