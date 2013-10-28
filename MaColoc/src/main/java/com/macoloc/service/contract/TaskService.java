package com.macoloc.service.contract;

import com.macoloc.domain.Task;
import com.macoloc.form.CreateTaskForm;
import com.macoloc.service.generic.GenericService;

public interface TaskService extends
		GenericService<Task, CreateTaskForm> {
}
