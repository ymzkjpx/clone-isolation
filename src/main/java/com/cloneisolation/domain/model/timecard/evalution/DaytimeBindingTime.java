package com.cloneisolation.domain.model.timecard.evalution;

import com.cloneisolation.domain.type.time.Minute;

/**
 * 日中拘束時間
 */
public class DaytimeBindingTime {
    Minute value;

    @Deprecated
    DaytimeBindingTime(){}

    public DaytimeBindingTime(Minute value) {
        this.value = value;
    }

    public DaytimeBindingTime(BindingTime bindingTime, NightBindingTime nightBindingTime){
        this(bindingTime.Mi)
    }

    public DaytimeBindingTime(int minute){
        this(new Minute(minute));
    }

    public Minute minute(){
        return value;
    }

    DaytimeWorkTime subtract(DaytimeBreakTime daytimeBreakTime){
        return new DaytimeWorkTime(value.sub(daytimeBreakTime.minute));
    }
}
