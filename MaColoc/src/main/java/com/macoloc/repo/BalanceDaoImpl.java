package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.Balance;
import com.macoloc.repo.contract.BalanceDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class BalanceDaoImpl extends GenericDaoImpl<Balance> implements BalanceDao {

    public BalanceDaoImpl() {
        super(Balance.class);
    }
}
