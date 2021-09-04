package com.cloneisolation.domain.model.legislation;


import com.cloneisolation.domain.model.timecard.timefact.StartDateTime;
import com.cloneisolation.domain.type.datetime.DateTime;
import com.cloneisolation.domain.type.time.Minute;
import com.cloneisolation.domain.type.time.Time;

import java.util.Date;

/**
 * 深夜
 */
public class Night {
    Time nightStartTime;
    Time nightEndTime;

    @Deprecated
    Night(){}

    public Night(Time nightStartTime, Time nightEndTime) {
        this.nightStartTime = nightStartTime;
        this.nightEndTime   = nightEndTime;
    }

    /**
     * 第三十七条第四項で定められている深夜
     */
    public static Night legal(){
        return new Night(new Time("22:00"), new Time("05:00"));
    }

    public Minute nightMinute(DateTime startDateTime, DateTime endDateTime){
        return
    }
}
