package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.Task;
import com.macoloc.repo.contract.TaskDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class TaskDaoImpl extends GenericDaoImpl<Task> implements TaskDao {

    public TaskDaoImpl() {
        super(Task.class);
    }

}
