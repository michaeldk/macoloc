package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.Key;
import com.macoloc.form.CreateKeyForm;
import com.macoloc.repo.contract.KeyDao;
import com.macoloc.service.contract.KeyService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class KeyServiceImpl extends GenericServiceImpl<Key, CreateKeyForm> implements KeyService {

    @Autowired
    public KeyServiceImpl(final KeyDao dao) {
        super(dao);
    }

    @Override
    public CreateKeyForm createForm() {
        return new CreateKeyForm();
    }

    @Override
    protected Key populateEntity(final Key element, final CreateKeyForm form) {
    	return element;
    }

    @Override
    protected void populateForm(final CreateKeyForm form, final Key element) {
    }
	
	public void verifyBusinessRules(Key key) throws Exception {
	}

}
