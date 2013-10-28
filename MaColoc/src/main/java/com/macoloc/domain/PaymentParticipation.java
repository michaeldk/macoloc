package com.macoloc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class PaymentParticipation extends Versionable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "paymentparticipation_sequence_gen")
    @SequenceGenerator(name = "paymentparticipation_sequence_gen", sequenceName = "paymentparticipation_id_seq")
    private int id;
	
	@OneToOne
	private Payment payment;
	
	@OneToOne
	private Roommate roommate;
	
	private double amount;
	
	private boolean done;

	public PaymentParticipation() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Roommate getRoommate() {
		return roommate;
	}

	public void setRoommate(Roommate user) {
		this.roommate = user;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
}
