package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.Subtask;
import com.macoloc.form.CreateSubtaskForm;
import com.macoloc.repo.contract.SubtaskDao;
import com.macoloc.service.contract.SubtaskService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class SubtaskServiceImpl extends GenericServiceImpl<Subtask, CreateSubtaskForm> implements SubtaskService {

    @Autowired
    public SubtaskServiceImpl(final SubtaskDao dao) {
        super(dao);
    }

    @Override
    public CreateSubtaskForm createForm() {
        return new CreateSubtaskForm();
    }

    @Override
    protected Subtask populateEntity(Subtask element, CreateSubtaskForm form) {
    	if (element == null) {
    		element = new Subtask();
    	}
    	// TODO Auto-generated method stub
    	return element;
    }

    @Override
    protected void populateForm(final CreateSubtaskForm form, final Subtask element) {
    	// TODO Auto-generated method stub
    }
	
	public void verifyBusinessRules(Subtask Subtask) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(CreateSubtaskForm form) throws Exception {
		// TODO Auto-generated method stub
	}

}
