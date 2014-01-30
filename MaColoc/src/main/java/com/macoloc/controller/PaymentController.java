package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macoloc.controller.generic.GenericControllerImpl;
import com.macoloc.domain.Payment;
import com.macoloc.form.CreatePaymentForm;
import com.macoloc.service.contract.PaymentService;

/**
 * The payments controller.
 */
@Controller
@RequestMapping("/payments")
public class PaymentController extends GenericControllerImpl<Payment, CreatePaymentForm> {

    @Autowired
    public PaymentController(final PaymentService service) {
        super("payments", Payment.class.getSimpleName().toLowerCase(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
