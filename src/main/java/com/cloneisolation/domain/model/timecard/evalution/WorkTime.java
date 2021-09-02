package com.cloneisolation.domain.model.timecard.evalution;

import com.cloneisolation.domain.type.time.Minute;

/**
 * 勤務時間
 */
public class WorkTime {
    Minute value;

    @Deprecated
    WorkTime() {}

    public WorkTime(Minute value) {
        this.value = value;
    }

    public WorkTime(DaytimeWorkTime daytimeWorkTime, NightWorkTime nightWorTime) {
        this(daytimeWorkTime.minute()
                            .add(nightWorTime.value));
    }

    public Minute minute() {
        return value;
    }

    @Override
    public String toString() {
        return "WorkTime{" + "value=" + value + '}';
    }
}
