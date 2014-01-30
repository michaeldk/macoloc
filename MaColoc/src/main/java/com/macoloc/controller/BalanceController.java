package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macoloc.controller.generic.GenericControllerImpl;
import com.macoloc.domain.Balance;
import com.macoloc.form.CreateBalanceForm;
import com.macoloc.service.contract.BalanceService;

/**
 * The invitations controller.
 */
@Controller
@RequestMapping("/balances")
public class BalanceController extends GenericControllerImpl<Balance, CreateBalanceForm> {

    @Autowired
    public BalanceController(final BalanceService service) {
        super("balances", Balance.class.getSimpleName().toLowerCase(), service);
    }
    
    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
