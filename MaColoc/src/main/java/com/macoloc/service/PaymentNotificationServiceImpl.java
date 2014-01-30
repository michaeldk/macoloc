package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.PaymentNotification;
import com.macoloc.form.CreatePaymentNotificationForm;
import com.macoloc.repo.contract.PaymentNotificationDao;
import com.macoloc.service.contract.PaymentNotificationService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class PaymentNotificationServiceImpl extends GenericServiceImpl<PaymentNotification, CreatePaymentNotificationForm> implements PaymentNotificationService {

    @Autowired
    public PaymentNotificationServiceImpl(final PaymentNotificationDao dao) {
        super(dao);
    }

    @Override
    public CreatePaymentNotificationForm createForm() {
        return new CreatePaymentNotificationForm();
    }

    @Override
    protected PaymentNotification populateEntity(PaymentNotification element, CreatePaymentNotificationForm form) {
    	if (element == null) {
    		element = new PaymentNotification();
    	}
    	// TODO Auto-generated method stub
    	return element;
    }

    @Override
    protected void populateForm(final CreatePaymentNotificationForm form, final PaymentNotification element) {
    	// TODO Auto-generated method stub
    }
	
	public void verifyBusinessRules(PaymentNotification PaymentNotification) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(CreatePaymentNotificationForm form) throws Exception {
		// TODO Auto-generated method stub
	}

}
