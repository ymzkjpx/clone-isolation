package com.cloneisolation.domain.model.timecard.evalution;

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
}
