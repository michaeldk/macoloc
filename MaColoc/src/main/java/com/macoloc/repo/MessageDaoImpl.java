package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.Message;
import com.macoloc.repo.contract.MessageDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class MessageDaoImpl extends GenericDaoImpl<Message> implements MessageDao {

    public MessageDaoImpl() {
        super(Message.class);
    }

}
