package com.macoloc.service.contract;

import com.macoloc.domain.Roommate;
import com.macoloc.form.CreateRoommateForm;
import com.macoloc.service.generic.GenericService;

public interface RoommateService extends
		GenericService<Roommate, CreateRoommateForm> {
	Roommate findByEmail(String email);
}
