package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.ListObject;
import com.macoloc.repo.contract.ListObjectDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class ListObjectDaoImpl extends GenericDaoImpl<ListObject> implements ListObjectDao {

    public ListObjectDaoImpl() {
        super(ListObject.class);
    }
}
