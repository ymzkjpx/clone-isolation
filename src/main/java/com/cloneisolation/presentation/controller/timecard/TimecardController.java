package com.cloneisolation.presentation.controller.timecard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/timecard")
public class TimecardController {

//    @ModelAttribute("employees")
//    ContractingEmployees employees() {
//        return employeeQueryService.contractingEmployees();
//    }
//
//    @ModelAttribute("attendanceForm")
//    AttendanceForm attendanceForm() {
//        AttendanceForm attendanceForm = new AttendanceForm();
//        return attendanceForm;
//    }

    @GetMapping
    String init(){
        return "timecard/form";
    }
}
