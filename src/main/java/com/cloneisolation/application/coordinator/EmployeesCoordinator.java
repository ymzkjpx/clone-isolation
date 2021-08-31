package com.cloneisolation.application.coordinator;

import com.cloneisolation.application.service.EmployeesService;
import com.cloneisolation.domain.timecard.OperationResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesCoordinator {
    @Autowired
    EmployeesService employeesService;

    /**
     * 従業員一覧を表示する
     */
    public OperationResults showList(){
        return employeesService.showList();
    }
}
