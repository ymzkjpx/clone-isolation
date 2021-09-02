package com.cloneisolation.domain.model.timecard.timefact;

public class WorkRange {
    StartDateTime startDateTime;
    EndDateTime endDateTime;
    boolean workTimeValid;

    @Deprecated
    WorkRange(){}

    public WorkRange(StartDateTime startDateTime, EndDateTime endDateTIme) {
        this.startDateTime = startDateTime;
        this.endDateTime   = endDateTIme;
    }

    public StartDateTime startDateTime() {
        return startDateTime;
    }

    public EndDateTime endDateTIme() {
        return endDateTime;
    }
}
