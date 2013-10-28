package com.macoloc.service.contract;

import com.macoloc.domain.Ping;
import com.macoloc.form.CreatePingForm;
import com.macoloc.service.generic.GenericService;

public interface PingService extends
		GenericService<Ping, CreatePingForm> {
}
