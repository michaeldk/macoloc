package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.ListObject;
import com.macoloc.form.CreateListObjectForm;
import com.macoloc.repo.contract.ListObjectDao;
import com.macoloc.service.contract.ListObjectService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class ListObjectServiceImpl extends GenericServiceImpl<ListObject, CreateListObjectForm> implements ListObjectService {

    @Autowired
    public ListObjectServiceImpl(final ListObjectDao dao) {
        super(dao);
    }

    @Override
    public CreateListObjectForm createForm() {
        return new CreateListObjectForm();
    }

    @Override
    protected ListObject populateEntity(ListObject element, CreateListObjectForm form) {
    	if (element == null) {
    		element = new ListObject();
    	}
    	// TODO Auto-generated method stub
    	return element;
    }

    @Override
    protected void populateForm(final CreateListObjectForm form, final ListObject element) {
    	// TODO Auto-generated method stub
    }
	
	public void verifyBusinessRules(ListObject ListObject) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(CreateListObjectForm form) throws Exception {
		// TODO Auto-generated method stub
	}

}
