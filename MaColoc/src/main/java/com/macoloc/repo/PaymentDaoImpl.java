package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.Payment;
import com.macoloc.repo.contract.PaymentDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class PaymentDaoImpl extends GenericDaoImpl<Payment> implements PaymentDao {

    public PaymentDaoImpl() {
        super(Payment.class);
    }

}
