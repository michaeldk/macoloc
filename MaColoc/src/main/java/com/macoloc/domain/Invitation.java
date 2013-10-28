package com.macoloc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class Invitation extends Versionable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "invitation_sequence_gen")
    @SequenceGenerator(name = "invitation_sequence_gen", sequenceName = "invitation_id_seq")
    private int id;
	
	@OneToOne
	private Roommate inviter;
	
	@NotNull
	private String invitedEmail;
	
	@OneToOne
	private Colocation colocation;

	public Invitation() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Colocation getColocation() {
		return colocation;
	}

	public void setColocation(Colocation colocation) {
		this.colocation = colocation;
	}

	public Roommate getInviter() {
		return inviter;
	}

	public void setInviter(Roommate inviter) {
		this.inviter = inviter;
	}

	public String getInvitedEmail() {
		return invitedEmail;
	}

	public void setInvitedEmail(String invitedEmail) {
		this.invitedEmail = invitedEmail;
	}
}
