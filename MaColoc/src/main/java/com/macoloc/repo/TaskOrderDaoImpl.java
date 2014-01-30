package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.TaskOrder;
import com.macoloc.repo.contract.TaskOrderDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class TaskOrderDaoImpl extends GenericDaoImpl<TaskOrder> implements TaskOrderDao {

    public TaskOrderDaoImpl() {
        super(TaskOrder.class);
    }
}
