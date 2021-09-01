package com.cloneisolation.domain.model.timecard.timefact;

import com.cloneisolation.domain.model.timecard.evalution.WorkDate;

public class WorkRange {
    StartDateTime startDateTime;
    EndDateTIme endDateTIme;
    boolean workTimeValid;

    @Deprecated
    WorkRange(){}

    public WorkRange(StartDateTime startDateTime, EndDateTIme endDateTIme) {
        this.startDateTime = startDateTime;
        this.endDateTIme   = endDateTIme;
    }

    public StartDateTime startDateTime() {
        return startDateTime;
    }

    public EndDateTIme endDateTIme() {
        return endDateTIme;
    }
}
