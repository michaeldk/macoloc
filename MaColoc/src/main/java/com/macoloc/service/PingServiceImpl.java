package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.Ping;
import com.macoloc.form.CreatePingForm;
import com.macoloc.repo.contract.PingDao;
import com.macoloc.service.contract.PingService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class PingServiceImpl extends GenericServiceImpl<Ping, CreatePingForm> implements PingService {

    @Autowired
    public PingServiceImpl(final PingDao dao) {

        super(dao);
    }

    @Override
    public CreatePingForm createForm() {

        return new CreatePingForm();
    }

    @Override
    protected Ping populateEntity(final Ping element, final CreatePingForm form) {
    	return element;
    }

    @Override
    protected void populateForm(final CreatePingForm form, final Ping element) {
    }
	
	public void verifyBusinessRules(Ping ping) throws Exception {
	}

}
