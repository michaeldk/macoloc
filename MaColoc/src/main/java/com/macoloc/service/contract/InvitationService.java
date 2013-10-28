package com.macoloc.service.contract;

import com.macoloc.domain.Invitation;
import com.macoloc.form.CreateInvitationForm;
import com.macoloc.service.generic.GenericService;

public interface InvitationService extends
		GenericService<Invitation, CreateInvitationForm> {
}
