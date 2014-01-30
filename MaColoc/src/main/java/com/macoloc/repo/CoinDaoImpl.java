package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.Coin;
import com.macoloc.repo.contract.CoinDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class CoinDaoImpl extends GenericDaoImpl<Coin> implements CoinDao {

    public CoinDaoImpl() {
        super(Coin.class);
    }
}
