package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macoloc.controller.generic.GenericControllerImpl;
import com.macoloc.domain.Subtask;
import com.macoloc.form.CreateSubtaskForm;
import com.macoloc.service.contract.SubtaskService;

/**
 * The subtasks controller.
 */
@Controller
@RequestMapping("/subtasks")
public class SubtaskController extends GenericControllerImpl<Subtask, CreateSubtaskForm> {

    @Autowired
    public SubtaskController(final SubtaskService service) {
        super("subtasks", Subtask.class.getSimpleName().toLowerCase(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
