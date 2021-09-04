package com.cloneisolation.domain.model.timecard.evalution;

import com.cloneisolation.domain.model.legislation.Night;
import com.cloneisolation.domain.model.timecard.timefact.WorkRange;
import com.cloneisolation.domain.type.time.Minute;

public class NightBindingTime {
    Minute value;

    @Deprecated
    NightBindingTime() {}

    public NightBindingTime(Minute value) {
        this.value = value;
    }

    public NightBindingTime(WorkRange workRange, Night night){
        this(
    }

    public NightBindingTime(WorkRange workRange){
        this(workRange, Night.legal());
    }

    public NightWorkTime nightWorkTime(){
        return nightBindingTime()
    }

    public Minute minute() {
        return value;
    }

    NightWorkTime subtract(NightBreakTime nightBreakTime) {
        return new NightWorkTime(value.sub(nightBreakTime.minute()));
    }
}
