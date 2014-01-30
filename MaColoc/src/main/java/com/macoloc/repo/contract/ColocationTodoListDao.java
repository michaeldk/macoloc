package com.macoloc.repo.contract;

import com.macoloc.domain.Colocation;
import com.macoloc.domain.ColocationTodoList;
import com.macoloc.repo.generic.GenericDao;

public interface ColocationTodoListDao extends GenericDao<ColocationTodoList> {
	ColocationTodoList findByColocation(Colocation colocation);
}
