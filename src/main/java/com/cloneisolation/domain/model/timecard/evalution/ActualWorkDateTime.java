package com.cloneisolation.domain.model.timecard.evalution;

import com.cloneisolation.domain.model.timecard.timefact.WorkRange;

/**
 * 勤務日時実績
 */
public class ActualWorkDateTime {
    WorkRange workRange;
    DaytimeBreakTime daytimeBreakTime;
    NightBreakTime nightBreakTime;
    boolean daytimeBreakTimeValid;
    boolean nightBreakTimeValid;

    @Deprecated
    ActualWorkDateTime() {}

    public ActualWorkDateTime(WorkRange workRange, DaytimeBreakTime daytimeBreakTime, NightBreakTime nightBreakTime) {
        this.workRange        = workRange;
        this.daytimeBreakTime = daytimeBreakTime;
        this.nightBreakTime   = nightBreakTime;
    }

    public WorkRange workRange() {
        return workRange;
    }

    public DaytimeBreakTime daytimeBreakTime() {
        return daytimeBreakTime;
    }

    public NightBreakTime nightBreakTime() {
        return nightBreakTime;
    }

    public WorkDate workDate() {
        return new WorkDate(workRange.startDateTime()
                                     .date());
    }

    public WorkTime workTime() {
        return new WorkTime(dayTimeWorkTime(), nightWorkTime());
    }

    /**
     * 拘束時間: new BindingTime(workRange)
     * 勤務時間: o
     * 休憩時間: o
     * 昼 拘束時間: o
     * 昼 勤務時間: o
     * 昼 休憩時間: o
     * 夜 拘束時間: o
     * 夜 勤務時間: o
     * 夜 休憩時間: o
     * worRangeは全体
     * 夜 勤務時間は全体の内夜間の時間を計算して抽出
     */

    public BreakTime breakTime() {
        return new BreakTime(daytimeBreakTime, nightBreakTime);
    }

    public DaytimeBindingTime daytimeBindingTime() {
        BindingTime bindingTime = new BindingTime(workRange);
        NightBindingTime nightBindingTime = nightBindingTime();
        return new DaytimeBindingTime(bindingTime, nightBindingTime);
    }
    public NightBindingTime nightBindingTime() {
        return new NightBindingTime(workRange);
    }

    public DaytimeWorkTime dayTimeWorkTime() {
        DaytimeBindingTime bindingTime = daytimeBindingTime();
        return bindingTime.subtract(daytimeBreakTime);
    }


    public NightWorkTime nightWorkTime() {
        NightBindingTime nightBindingTime = nightBindingTime();
        return nightBindingTime.subtract(nightBreakTime);
    }
}
