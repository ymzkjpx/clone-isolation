package com.cloneisolation.domain.model.timecard.evalution;

import com.cloneisolation.domain.type.time.Minute;

public class NightWorkTime {
    Minute value;

    @Deprecated
    NightWorkTime(){}

    public NightWorkTime(Minute value) {
        this.value = value;
    }

    public NightWorkTime(int minute){
        this(new Minute(minute));
    }

    public Minute minute(){
        return value;
    }

    @Override
    public String toString() {
        return "NightWorkTime{" + "value=" + value + '}';
    }
}
