package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macoloc.controller.generic.GenericControllerImpl;
import com.macoloc.domain.PaymentNotification;
import com.macoloc.form.CreatePaymentNotificationForm;
import com.macoloc.service.contract.PaymentNotificationService;

/**
 * The paaymentNotifications controller.
 */
@Controller
@RequestMapping("/paymentNotifications")
public class PaymentNotificationController extends GenericControllerImpl<PaymentNotification, CreatePaymentNotificationForm> {

    @Autowired
    public PaymentNotificationController(final PaymentNotificationService service) {
        super("paymentNotifications", PaymentNotification.class.getSimpleName().toLowerCase(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
