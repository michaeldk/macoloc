package com.macoloc.service.contract;

import com.macoloc.domain.Message;
import com.macoloc.form.CreateMessageForm;
import com.macoloc.service.generic.GenericService;

public interface MessageService extends
		GenericService<Message, CreateMessageForm> {
}
