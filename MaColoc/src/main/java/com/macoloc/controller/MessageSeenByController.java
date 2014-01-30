package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macoloc.controller.generic.GenericControllerImpl;
import com.macoloc.domain.MessageSeenBy;
import com.macoloc.form.CreateMessageSeenByForm;
import com.macoloc.service.contract.MessageSeenByService;

/**
 * The messageseenby controller.
 */
@Controller
@RequestMapping("/messageseenby")
public class MessageSeenByController extends GenericControllerImpl<MessageSeenBy, CreateMessageSeenByForm> {

    @Autowired
    public MessageSeenByController(final MessageSeenByService service) {
        super("messageseenby", MessageSeenBy.class.getSimpleName().toLowerCase(), service);
    }
    
    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
