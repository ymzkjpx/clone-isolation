package com.cloneisolation.application.service;

import com.cloneisolation.domain.model.timecard.OperationResults;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository {
    OperationResults list();
}
