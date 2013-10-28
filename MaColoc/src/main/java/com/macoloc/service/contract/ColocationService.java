package com.macoloc.service.contract;

import com.macoloc.domain.Colocation;
import com.macoloc.form.CreateColocationForm;
import com.macoloc.service.generic.GenericService;

public interface ColocationService extends
		GenericService<Colocation, CreateColocationForm> {
}
