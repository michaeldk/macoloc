package com.macoloc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.macoloc.controller.generic.GenericControllerImpl;
import com.macoloc.controller.util.SessionData;
import com.macoloc.domain.Colocation;
import com.macoloc.domain.ColocationTodoList;
import com.macoloc.form.CreateColocationTodoListForm;
import com.macoloc.service.contract.ColocationTodoListService;

/**
 * The invitations controller.
 */
@Controller
@RequestMapping("/colocationtodolists")
public class ColocationTodoListController extends GenericControllerImpl<ColocationTodoList, CreateColocationTodoListForm> {

	private ColocationTodoListService service;
	
    @Autowired
    public ColocationTodoListController(final ColocationTodoListService service) {
        super("colocationtodolists", ColocationTodoList.class.getSimpleName().toLowerCase(), service);
        this.service = service;
    }
    
    /**
     * Retrieves the colocation ID from the user's session
     */
    @Override
    @RequestMapping(method = RequestMethod.GET)
    public String defaultHome(final Model model, HttpSession session) {
    	Colocation coloc = SessionData.findColocation(session);
    	if (coloc == null) {
    		return "redirect:/coloc/create";
    	}
    	model.addAttribute("todoList", this.service.findByColocation(coloc));
    	loadEntities(model);
    	return "display/" + this.name;
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
