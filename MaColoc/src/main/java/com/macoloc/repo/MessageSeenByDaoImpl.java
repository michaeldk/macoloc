package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.MessageSeenBy;
import com.macoloc.repo.contract.MessageSeenByDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class MessageSeenByDaoImpl extends GenericDaoImpl<MessageSeenBy> implements MessageSeenByDao {

    public MessageSeenByDaoImpl() {
        super(MessageSeenBy.class);
    }
}
