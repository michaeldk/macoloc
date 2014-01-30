package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.Subtask;
import com.macoloc.repo.contract.SubtaskDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class SubtaskDaoImpl extends GenericDaoImpl<Subtask> implements SubtaskDao {

    public SubtaskDaoImpl() {
        super(Subtask.class);
    }
}
