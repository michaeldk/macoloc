package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.ColocationList;
import com.macoloc.repo.contract.ColocationListDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class ColocationListDaoImpl extends GenericDaoImpl<ColocationList> implements ColocationListDao {

    public ColocationListDaoImpl() {
        super(ColocationList.class);
    }
}
