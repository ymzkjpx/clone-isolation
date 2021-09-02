package com.cloneisolation.domain.model.timecard.evalution;

import com.cloneisolation.domain.model.timecard.timefact.WorkRange;

import javax.naming.Binding;

/**
 * 勤務日時実績
 */
public class ActualWorkDateTime{
    WorkRange workRange;
    DaytimeBreakTime daytimeBreakTime;
    NightBreakTime nightBreakTime;
    boolean daytimeBreakTimeValid;
    boolean nightBreakTimeValid;

    @Deprecated
    ActualWorkDateTime(){}

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

    public WorkDate workDate(){
        return new WorkDate(workRange.startDateTime().date());
    }

    public WorkTime workTime(){
        return new WorkTime(dayTimeWorkTime(), nightWorkTime());
    }

    public BreakTime breakTime(){
        return new BreakTime(daytimeBreakTime, nightBreakTime);
    }

    public DaytimeBindingTime daytimeBindingTime(){
        BindingTime bindingTime = new BindingTime(workRange);
        NightBindingTime nightBindingTime = nightBindingTime();
        return new DaytimeBindingTime(bindingTime, nightBindingTime);
    }

    public DaytimeWorkTime dayTimeWorkTime(){
        DaytimeBindingTime bindingTime = daytimeBindingTime();
        return bindingTime.subtract(daytimeBreakTime);
    }

    public NightBindingTime nightBindingTime(){
        return
    }

    public NightWorkTime nightWorkTime(){
        NightBindingTime bindingTime = nightBindingTime();
        return
    }
}
