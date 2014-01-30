package com.macoloc.service.contract;

import com.macoloc.domain.Colocation;
import com.macoloc.domain.ColocationTodoList;
import com.macoloc.form.CreateColocationTodoListForm;
import com.macoloc.service.generic.GenericService;

public interface ColocationTodoListService extends GenericService<ColocationTodoList, CreateColocationTodoListForm> {
	ColocationTodoList findByColocation (Colocation colocation);
}
