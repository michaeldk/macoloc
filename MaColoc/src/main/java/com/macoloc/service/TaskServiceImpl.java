package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.Task;
import com.macoloc.form.CreateTaskForm;
import com.macoloc.repo.contract.TaskDao;
import com.macoloc.service.contract.TaskService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class TaskServiceImpl extends GenericServiceImpl<Task, CreateTaskForm> implements TaskService {

    @Autowired
    public TaskServiceImpl(final TaskDao dao) {
        super(dao);
    }

    @Override
    public CreateTaskForm createForm() {
        return new CreateTaskForm();
    }

    @Override
    protected Task populateEntity(final Task element, final CreateTaskForm form) {
    	return element;
    }

    @Override
    protected void populateForm(final CreateTaskForm form, final Task element) {
    }
	
	public void verifyBusinessRules(Task task) throws Exception {
	}

}
