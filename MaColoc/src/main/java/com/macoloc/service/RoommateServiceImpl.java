package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.Roommate;
import com.macoloc.form.CreateRoommateForm;
import com.macoloc.repo.contract.RoommateDao;
import com.macoloc.service.contract.RoommateService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class RoommateServiceImpl extends GenericServiceImpl<Roommate, CreateRoommateForm> implements RoommateService {

    @Autowired
    public RoommateServiceImpl(final RoommateDao dao) {
        super(dao);
    }

    @Override
    public CreateRoommateForm createForm() {
        return new CreateRoommateForm();
    }

    @Override
    protected Roommate populateEntity(Roommate element, final CreateRoommateForm form) {
    	if (element == null) {
    		element = new Roommate();
    	}
    	element.setEmail(form.getEmail());
    	element.setFirstName(form.getFirstName());
    	element.setLastName(form.getLastName());
    	element.setPassword(form.getPassword());
    	return element;
    }

    @Override
    protected void populateForm(CreateRoommateForm form, final Roommate element) {
    	if (form == null) {
    		form = new CreateRoommateForm();
    	}
    	form.setEmail(element.getEmail());
    	form.setFirstName(element.getFirstName());
    	form.setLastName(element.getLastName());
    	form.setPassword(element.getPassword());
    	form.setConfirmPassword(element.getPassword());
    }
	
	public void verifyBusinessRules(Roommate roommate) throws Exception {
	}

	@Override
	public Roommate findByEmail(String email) {
		return ((RoommateDao) this.dao).findByEmail(email);
	}

}
