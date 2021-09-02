package com.cloneisolation.domain.model.timecard.timefact;

import com.cloneisolation.domain.type.datetime.DateTime;

public class StartDateTime {
    DateTime value;

    @Deprecated
    StartDateTime(){}

    public StartDateTime(DateTime value) {
        this.value = value;
    }


}
