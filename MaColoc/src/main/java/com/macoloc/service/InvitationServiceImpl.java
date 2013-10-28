package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.Invitation;
import com.macoloc.form.CreateInvitationForm;
import com.macoloc.repo.contract.InvitationDao;
import com.macoloc.service.contract.InvitationService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class InvitationServiceImpl extends GenericServiceImpl<Invitation, CreateInvitationForm> implements InvitationService {

    @Autowired
    public InvitationServiceImpl(final InvitationDao dao) {
        super(dao);
    }

    @Override
    public CreateInvitationForm createForm() {
        return new CreateInvitationForm();
    }

    @Override
    protected Invitation populateEntity(Invitation element, final CreateInvitationForm form) {
    	return element;
    }

    @Override
    protected void populateForm(final CreateInvitationForm form, final Invitation element) {
    }
	
	public void verifyBusinessRules(Invitation invitation) throws Exception {
	}

}
