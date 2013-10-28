package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.Colocation;
import com.macoloc.repo.contract.ColocationDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class ColocationDaoImpl extends GenericDaoImpl<Colocation> implements ColocationDao {

    public ColocationDaoImpl() {

        super(Colocation.class);
    }

}
