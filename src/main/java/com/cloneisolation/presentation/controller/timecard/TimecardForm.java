package com.cloneisolation.presentation.controller.timecard;

import com.cloneisolation.domain.model.employee.EmployeeId;
import com.cloneisolation.domain.model.timecard.evalution.DaytimeBreakTime;
import com.cloneisolation.domain.model.timecard.evalution.NightBreakTime;
import com.cloneisolation.domain.model.timecard.evalution.WorkDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimecardForm {
    EmployeeId employeeId;
    WorkDate workDate;
    StartTime startTime;
    EndTime endTime;
    DaytimeBreakTime daytimeBreakTime;
    NightBreakTime nightBreakTime;
    boolean isDaysOff;
    TimeRecord timeRecord;

    @Deprecated
    TimecardForm() {}

    public TimecardForm(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public static TimecardForm empty() {
        return new TimecardForm();
    }

        String workerName;
        LocalDate workDate;
        LocalDateTime startHourly;
        LocalDateTime startMinutes;
        LocalDateTime endHourly;
        LocalDateTime endMinutes;
        LocalDateTime daytimeBreakTime;
        LocalDateTime nightBreakTime;
        Boolean isDaysOff;

        public TimecardForm(EmployeeId employeeId,
                String workerName,
                LocalDate workDate,
                LocalDateTime startHourly,
                LocalDateTime startMinutes,
                LocalDateTime endHourly,
                LocalDateTime endMinutes,
                LocalDateTime daytimeBreakTime,
                LocalDateTime nightBreakTime,
                Boolean isDaysOff) {
            this.employeeId       = employeeId;
            this.workerName       = workerName;
            this.workDate         = workDate;
            this.startHourly      = startHourly;
            this.startMinutes     = startMinutes;
            this.endHourly        = endHourly;
            this.endMinutes       = endMinutes;
            this.daytimeBreakTime = daytimeBreakTime;
            this.nightBreakTime   = nightBreakTime;
            this.isDaysOff        = isDaysOff;
        }

    public EmployeeId employeeId() {
        return employeeId;
    }
}
