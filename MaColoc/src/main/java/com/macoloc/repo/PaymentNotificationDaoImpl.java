package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.PaymentNotification;
import com.macoloc.repo.contract.PaymentNotificationDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class PaymentNotificationDaoImpl extends GenericDaoImpl<PaymentNotification> implements PaymentNotificationDao {

    public PaymentNotificationDaoImpl() {
        super(PaymentNotification.class);
    }
}
