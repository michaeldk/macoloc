package com.macoloc.repo;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.Invitation;
import com.macoloc.repo.contract.InvitationDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class InvitationDaoImpl extends GenericDaoImpl<Invitation> implements InvitationDao {

    public InvitationDaoImpl() {
        super(Invitation.class);
    }

}
