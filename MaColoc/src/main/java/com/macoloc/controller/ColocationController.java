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
import com.macoloc.form.CreateColocationForm;
import com.macoloc.service.contract.ColocationService;

/**
 * The colocations controller.
 */
@Controller
@RequestMapping("/coloc")
public class ColocationController extends GenericControllerImpl<Colocation, CreateColocationForm> {

    @Autowired
    public ColocationController (final ColocationService service) {
        super("colocations", Colocation.class.getSimpleName().toLowerCase(), service);
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
    	model.addAttribute("coloc", coloc);
    	loadEntities(model);
    	return "display/" + this.name;
    }

    @Override
    protected void loadEntities (final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists (final Model model) {
    }
}
