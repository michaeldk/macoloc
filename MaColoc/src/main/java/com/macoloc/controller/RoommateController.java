package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macoloc.controller.generic.GenericControllerImpl;
import com.macoloc.domain.Roommate;
import com.macoloc.form.CreateRoommateForm;
import com.macoloc.service.contract.RoommateService;

/**
 * The roommates controller.
 */
@Controller
@RequestMapping("/roommates")
public class RoommateController extends GenericControllerImpl<Roommate, CreateRoommateForm> {

    @Autowired
    public RoommateController(final RoommateService service) {
        super("roommates", Roommate.class.getSimpleName().toLowerCase(), service);
    }
    
    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
