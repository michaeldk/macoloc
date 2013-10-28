package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.Key;
import com.macoloc.repo.contract.KeyDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class KeyDaoImpl extends GenericDaoImpl<Key> implements KeyDao {

    public KeyDaoImpl() {
        super(Key.class);
    }

}
