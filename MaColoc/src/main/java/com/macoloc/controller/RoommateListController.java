package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macoloc.controller.generic.GenericControllerImpl;
import com.macoloc.domain.RoommateList;
import com.macoloc.form.CreateRoommateListForm;
import com.macoloc.service.contract.RoommateListService;

/**
 * The roommateLists controller.
 */
@Controller
@RequestMapping("/roommateLists")
public class RoommateListController extends GenericControllerImpl<RoommateList, CreateRoommateListForm> {

    @Autowired
    public RoommateListController(final RoommateListService service) {
        super("roommateLists", RoommateList.class.getSimpleName().toLowerCase(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
