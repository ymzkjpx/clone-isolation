package com.cloneisolation.presentation.controller.timecard;

import com.cloneisolation.domain.employee.EmployeeId;

public class TimecardForm {
    EmployeeId employeeId;

    @Deprecated
    TimecardForm() {}

    public TimecardForm(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public static TimecardForm empty() {
        return new TimecardForm();
    }

    //    String workerName;
    //    LocalDate workDate;
    //    LocalDateTime startHourly;
    //    LocalDateTime startMinutes;
    //    LocalDateTime endHourly;
    //    LocalDateTime endMinutes;
    //    LocalDateTime daytimeBreakTime;
    //    LocalDateTime nightBreakTime;
    //    Boolean isDaysOff;
    //
    //    public TimecardForm(EmployeeId employeeId,
    //            String workerName,
    //            LocalDate workDate,
    //            LocalDateTime startHourly,
    //            LocalDateTime startMinutes,
    //            LocalDateTime endHourly,
    //            LocalDateTime endMinutes,
    //            LocalDateTime daytimeBreakTime,
    //            LocalDateTime nightBreakTime,
    //            Boolean isDaysOff) {
    //        this.employeeId       = employeeId;
    //        this.workerName       = workerName;
    //        this.workDate         = workDate;
    //        this.startHourly      = startHourly;
    //        this.startMinutes     = startMinutes;
    //        this.endHourly        = endHourly;
    //        this.endMinutes       = endMinutes;
    //        this.daytimeBreakTime = daytimeBreakTime;
    //        this.nightBreakTime   = nightBreakTime;
    //        this.isDaysOff        = isDaysOff;
    //    }

    public EmployeeId employeeId() {
        return employeeId;
    }

}
