package com.macoloc.repo.contract;

import com.macoloc.domain.Roommate;
import com.macoloc.repo.generic.GenericDao;

public interface RoommateDao extends GenericDao<Roommate> {
	Roommate findByEmail(String email);
}
