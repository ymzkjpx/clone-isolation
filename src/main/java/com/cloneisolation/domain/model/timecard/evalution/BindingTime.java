package com.cloneisolation.domain.model.timecard.evalution;

import com.cloneisolation.domain.model.timecard.timefact.WorkRange;
import com.cloneisolation.domain.type.time.Minute;

/**
 * 拘束時間
 */
public class BindingTime {
    WorkRange workRange;

    @Deprecated
    BindingTime(){}

    public BindingTime(WorkRange workRange) {
        this.workRange = workRange;
    }

    public Minute minute(){
        return workRange.minute();
    }

    @Override
    public String toString() {
        return "BindingTime{" + "workRange=" + workRange + '}';
    }
}
