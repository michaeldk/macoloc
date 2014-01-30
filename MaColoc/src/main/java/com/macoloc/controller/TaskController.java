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
 * The tasks controller.
 */
@Controller
@RequestMapping("/tasks")
public class TaskController extends GenericControllerImpl<Colocation, CreateColocationForm> {

    @Autowired
    public TaskController(final ColocationService service) {
        super("tasks", Colocation.class.getSimpleName().toLowerCase(), service);
    }
    
    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
