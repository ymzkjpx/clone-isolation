package com.cloneisolation.presentation.controller.timecard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/timecard")
public class TimecardController {

    @GetMapping
    String init(Model model) {
        model.addAttribute("timecardForm", TimecardForm.empty());
        return "timecard/form";
    }

    @PostMapping
    String register(@ModelAttribute("timecardForm") TimecardForm timecardForm, BindingResult bindingResult) {
        System.out.println(timecardForm);
        System.out.println(timecardForm.employeeId.value());
        return "timecard/form";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields("employeeId.value",
                "workDate.value",
                "startTime.hour.value",
                "startTime.minute.value",
                "endTime.hour.value",
                "endTime.minute.value",
                "daytimeBreakTime.value.value",
                "nightBreakTime.value.value",
                "isDaysOff");
    }

}
