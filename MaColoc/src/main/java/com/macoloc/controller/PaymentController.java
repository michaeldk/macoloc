package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macoloc.controller.generic.GenericControllerImpl;
import com.macoloc.domain.Colocation;
import com.macoloc.form.CreateColocationForm;
import com.macoloc.service.contract.ColocationService;

/**
 * The colocations controller.
 */
@Controller
@RequestMapping("/payments")
public class PaymentController extends GenericControllerImpl<Colocation, CreateColocationForm> {

    @Autowired
    public PaymentController(final ColocationService service) {
        super("payments", Colocation.class.getSimpleName(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
