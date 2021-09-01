package com.cloneisolation.presentation.controller.employee;

import com.cloneisolation.application.coordinator.EmployeesCoordinator;
import com.cloneisolation.domain.model.timecard.OperationResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeesCoordinator employeesCoordinator;

    @GetMapping
    String show(Model model){
        OperationResults list = employeesCoordinator.showList();
        model.addAttribute("operationResults", list);
        model.addAttribute("text", "hello");
        return "employee/employees";
    }
}
