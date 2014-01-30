package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macoloc.controller.generic.GenericControllerImpl;
import com.macoloc.domain.ColocationList;
import com.macoloc.form.CreateColocationListForm;
import com.macoloc.service.contract.ColocationListService;

/**
 * The colocationLists controller.
 */
@Controller
@RequestMapping("/colocationLists")
public class ColocationListController extends GenericControllerImpl<ColocationList, CreateColocationListForm> {

    @Autowired
    public ColocationListController(final ColocationListService service) {
       super("colocationLists", ColocationList.class.getSimpleName().toLowerCase(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
