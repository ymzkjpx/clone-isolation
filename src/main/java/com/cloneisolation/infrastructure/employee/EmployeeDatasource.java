package com.cloneisolation.infrastructure.employee;

import com.cloneisolation.application.service.EmployeesRepository;
import com.cloneisolation.domain.timecard.OperationResult;
import com.cloneisolation.domain.timecard.OperationResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDatasource implements EmployeesRepository {
    @Autowired
    EmployeesMapper employeesMapper;

    @Override
    public OperationResults list() {
        List<OperationResult> list = employeesMapper.list();
        return new OperationResults(list);
    }
}
