package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.TaskOrder;
import com.macoloc.form.CreateTaskOrderForm;
import com.macoloc.repo.contract.TaskOrderDao;
import com.macoloc.service.contract.TaskOrderService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class TaskOrderServiceImpl extends GenericServiceImpl<TaskOrder, CreateTaskOrderForm> implements TaskOrderService {

    @Autowired
    public TaskOrderServiceImpl(final TaskOrderDao dao) {
        super(dao);
    }

    @Override
    public CreateTaskOrderForm createForm() {
        return new CreateTaskOrderForm();
    }

    @Override
    protected TaskOrder populateEntity(TaskOrder element, CreateTaskOrderForm form) {
    	if (element == null) {
    		element = new TaskOrder();
    	}
    	// TODO Auto-generated method stub
    	return element;
    }

    @Override
    protected void populateForm(final CreateTaskOrderForm form, final TaskOrder element) {
    	// TODO Auto-generated method stub
    }
	
	public void verifyBusinessRules(TaskOrder TaskOrder) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(CreateTaskOrderForm form) throws Exception {
		// TODO Auto-generated method stub
	}

}
