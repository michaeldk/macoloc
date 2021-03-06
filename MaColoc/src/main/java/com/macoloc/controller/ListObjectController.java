package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macoloc.controller.generic.GenericControllerImpl;
import com.macoloc.domain.ListObject;
import com.macoloc.form.CreateListObjectForm;
import com.macoloc.service.contract.ListObjectService;

/**
 * The listobjects controller.
 */
@Controller
@RequestMapping("/listobjects")
public class ListObjectController extends GenericControllerImpl<ListObject, CreateListObjectForm> {

    @Autowired
    public ListObjectController(final ListObjectService service) {
        super("listobjects", ListObject.class.getSimpleName().toLowerCase(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
