package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macoloc.controller.generic.GenericControllerImpl;
import com.macoloc.domain.Message;
import com.macoloc.form.CreateMessageForm;
import com.macoloc.service.contract.MessageService;

/**
 * The messages controller.
 */
@Controller
@RequestMapping("/messages")
public class MessageController extends GenericControllerImpl<Message, CreateMessageForm> {

    @Autowired
    public MessageController(final MessageService service) {
        super("messages", Message.class.getSimpleName().toLowerCase(), service);
    }
    
    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
