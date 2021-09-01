package com.cloneisolation.domain.model.timecard;

import java.util.List;

public class OperationResults {
    List<OperationResult> list;

    public OperationResults(List<OperationResult> list) {
        this.list = list;
    }

    public List<OperationResult> asList() {
        return list;
    }

    public int size() {
        return list.size();
    }

    public boolean isPresents() {
        return size() > 0;
    }
}
