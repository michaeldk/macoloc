package com.macoloc.domain;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;


@Entity
public class MessageSeenBy extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "messageseenby_sequence_gen")
    @SequenceGenerator(name = "messageseenby_sequence_gen", sequenceName = "messageseenby_id_seq")
    private int id;
	
	@NotNull
	@OneToOne
	private Roommate roommate;
	
	@NotNull
	private Calendar date;
	
	public MessageSeenBy() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Roommate getRoommate() {
		return roommate;
	}

	public void setRoommate(Roommate user) {
		this.roommate = user;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

}
