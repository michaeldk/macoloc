package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.RoommateList;
import com.macoloc.form.CreateRoommateListForm;
import com.macoloc.repo.contract.RoommateListDao;
import com.macoloc.service.contract.RoommateListService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class RoommateListServiceImpl extends GenericServiceImpl<RoommateList, CreateRoommateListForm> implements RoommateListService {

    @Autowired
    public RoommateListServiceImpl(final RoommateListDao dao) {
        super(dao);
    }

    @Override
    public CreateRoommateListForm createForm() {
        return new CreateRoommateListForm();
    }

    @Override
    protected RoommateList populateEntity(RoommateList element, CreateRoommateListForm form) {
    	if (element == null) {
    		element = new RoommateList();
    	}
    	// TODO Auto-generated method stub
    	return element;
    }

    @Override
    protected void populateForm(final CreateRoommateListForm form, final RoommateList element) {
    	// TODO Auto-generated method stub
    }
	
	public void verifyBusinessRules(RoommateList RoommateList) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(CreateRoommateListForm form) throws Exception {
		// TODO Auto-generated method stub
	}

}
