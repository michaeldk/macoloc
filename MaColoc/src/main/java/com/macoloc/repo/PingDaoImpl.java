package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.Ping;
import com.macoloc.repo.contract.PingDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class PingDaoImpl extends GenericDaoImpl<Ping> implements PingDao {

    public PingDaoImpl() {
        super(Ping.class);
    }

}
