package com.cloneisolation.application.service;

import com.cloneisolation.domain.timecard.OperationResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesService {
    @Autowired
    EmployeesRepository employeesRepository;

    public OperationResults showList(){
        return employeesRepository.list();
    }
}
