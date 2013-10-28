package com.macoloc.service.contract;

import com.macoloc.domain.Payment;
import com.macoloc.form.CreatePaymentForm;
import com.macoloc.service.generic.GenericService;

public interface PaymentService extends
		GenericService<Payment, CreatePaymentForm> {
}
