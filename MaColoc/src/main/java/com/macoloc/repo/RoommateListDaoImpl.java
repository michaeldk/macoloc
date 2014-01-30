package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.RoommateList;
import com.macoloc.repo.contract.RoommateListDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class RoommateListDaoImpl extends GenericDaoImpl<RoommateList> implements RoommateListDao {

    public RoommateListDaoImpl() {
        super(RoommateList.class);
    }
}
