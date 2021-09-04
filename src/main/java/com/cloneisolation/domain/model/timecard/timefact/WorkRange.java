package com.cloneisolation.domain.model.timecard.timefact;

import com.cloneisolation.domain.type.datetime.DateTime;
import com.cloneisolation.domain.type.time.Minute;

public class WorkRange {
    StartDateTime startDateTime;
    EndDateTime endDateTime;
    boolean workTimeValid;

    @Deprecated
    WorkRange() {}

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

    public Minute minute() {
        return DateTime.between(startDateTime.value, endDateTime.value);
    }

    public String endTimeText() {
        return endDateTime.endTimeTextWith(startDateTime);
    }

    boolean notOverlap(WorkRange other) {
        return (startDateTime.isAfter(other.startDateTime) && startDateTime.isAfter(other.endDateTime)) ||
               (endDateTime.isBefore(other.endDateTime) && endDateTime.isBefore(other.endDateTime));
    }

    public boolean isOverlap(WorkRange other) {
        return !notOverlap(other);
    }

}
