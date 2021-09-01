package com.cloneisolation.domain.model.timecard.timefact;

import org.springframework.format.annotation.DateTimeFormat;

public class StartDateTime {
    DateTime value:

    @Deprecated
    StartDateTime(){}

    public StartDateTime(DateTime value) {
        this.value = value;
    }
}
