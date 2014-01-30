package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.MessageSeenBy;
import com.macoloc.form.CreateMessageSeenByForm;
import com.macoloc.repo.contract.MessageSeenByDao;
import com.macoloc.service.contract.MessageSeenByService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class MessageSeenByServiceImpl extends GenericServiceImpl<MessageSeenBy, CreateMessageSeenByForm> implements MessageSeenByService {

    @Autowired
    public MessageSeenByServiceImpl(final MessageSeenByDao dao) {
        super(dao);
    }

    @Override
    public CreateMessageSeenByForm createForm() {
        return new CreateMessageSeenByForm();
    }

    @Override
    protected MessageSeenBy populateEntity(MessageSeenBy element, CreateMessageSeenByForm form) {
    	if (element == null) {
    		element = new MessageSeenBy();
    	}
    	// TODO Auto-generated method stub
    	return element;
    }

    @Override
    protected void populateForm(final CreateMessageSeenByForm form, final MessageSeenBy element) {
    	// TODO Auto-generated method stub
    }
	
	public void verifyBusinessRules(MessageSeenBy MessageSeenBy) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(CreateMessageSeenByForm form) throws Exception {
		// TODO Auto-generated method stub
	}

}
