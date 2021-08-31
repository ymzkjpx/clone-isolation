package com.cloneisolation.application.service;

import com.cloneisolation.domain.timecard.OperationResult;
import com.cloneisolation.domain.timecard.OperationResults;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository {
    OperationResults list();
}
