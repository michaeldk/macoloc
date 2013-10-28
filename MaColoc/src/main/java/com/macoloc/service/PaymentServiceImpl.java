package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.Payment;
import com.macoloc.form.CreatePaymentForm;
import com.macoloc.repo.contract.PaymentDao;
import com.macoloc.service.contract.PaymentService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class PaymentServiceImpl extends GenericServiceImpl<Payment, CreatePaymentForm> implements PaymentService {

    @Autowired
    public PaymentServiceImpl(final PaymentDao dao) {
        super(dao);
    }

    @Override
    public CreatePaymentForm createForm() {
        return new CreatePaymentForm();
    }

    @Override
    protected Payment populateEntity(final Payment element, final CreatePaymentForm form) {
    	return element;
    }

    @Override
    protected void populateForm(final CreatePaymentForm form, final Payment element) {
    }
	
	public void verifyBusinessRules(Payment payment) throws Exception {
	}

}
