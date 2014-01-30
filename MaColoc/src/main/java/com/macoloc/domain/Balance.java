package com.macoloc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Balance extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "balance_sequence_gen")
    @SequenceGenerator(name = "balance_sequence_gen", sequenceName = "balance_id_seq")
    private int id;

	@NotNull
	@OneToOne
	private Roommate roommate;
	
	private double balance;
	
	public Balance() {
		super();
	}

	public Roommate getRoommate() {
		return roommate;
	}

	public void setRoommate(Roommate roommate) {
		this.roommate = roommate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
