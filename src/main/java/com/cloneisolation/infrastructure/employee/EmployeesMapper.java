package com.cloneisolation.infrastructure.employee;

import com.cloneisolation.domain.timecard.OperationResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeesMapper {
    List<OperationResult> list();
}
