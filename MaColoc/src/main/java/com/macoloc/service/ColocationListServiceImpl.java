package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.ColocationList;
import com.macoloc.form.CreateColocationListForm;
import com.macoloc.repo.contract.ColocationListDao;
import com.macoloc.service.contract.ColocationListService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class ColocationListServiceImpl extends GenericServiceImpl<ColocationList, CreateColocationListForm> implements ColocationListService {

    @Autowired
    public ColocationListServiceImpl(final ColocationListDao dao) {
        super(dao);
    }

    @Override
    public CreateColocationListForm createForm() {
        return new CreateColocationListForm();
    }

    @Override
    protected ColocationList populateEntity(ColocationList element, CreateColocationListForm form) {
    	if (element == null) {
    		element = new ColocationList();
    	}
    	// TODO Auto-generated method stub
    	return element;
    }

    @Override
    protected void populateForm(final CreateColocationListForm form, final ColocationList element) {
    	// TODO Auto-generated method stub
    }
	
	public void verifyBusinessRules(ColocationList ColocationList) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(CreateColocationListForm form) throws Exception {
		// TODO Auto-generated method stub
	}

}
