package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.PaymentParticipation;
import com.macoloc.repo.contract.PaymentParticipationDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class PaymentParticipationDaoImpl extends GenericDaoImpl<PaymentParticipation> implements PaymentParticipationDao {

    public PaymentParticipationDaoImpl() {
        super(PaymentParticipation.class);
    }
}
