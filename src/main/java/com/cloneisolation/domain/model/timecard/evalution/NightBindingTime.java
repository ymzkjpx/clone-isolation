package com.cloneisolation.domain.model.timecard.evalution;

import com.cloneisolation.domain.type.time.Minute;

public class NightBindingTime {
    Minute value;

    @Deprecated
    NightBindingTime() {}

    public NightBindingTime(Minute value) {
        this.value = value;
    }

    public Minute minute() {
        return value;
    }

    NightWorkTime subtract(NightBreakTime nightBreakTime) {
        return new NightWorkTime(value.sub(nightBreakTime.minute()));
    }
}
