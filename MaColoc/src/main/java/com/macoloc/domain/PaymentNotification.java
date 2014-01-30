package com.macoloc.domain;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class PaymentNotification extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "paymentNotification_sequence_gen")
    @SequenceGenerator(name = "paymentNotification_sequence_gen", sequenceName = "paymentNotification_id_seq")
    private int id;
	
	@NotNull
	@OneToOne
	private Payment payment;
	
	@NotNull
	private Calendar date;
	
	@NotNull
	@OneToOne
	private Roommate paymentMadeBy;
	
	@NotNull
	@OneToOne
	private Roommate paymentMadeTo;

	public PaymentNotification() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Roommate getPaymentMadeBy() {
		return paymentMadeBy;
	}

	public void setPaymentMadeBy(Roommate paymentMadeBy) {
		this.paymentMadeBy = paymentMadeBy;
	}

	public Roommate getPaymentMadeTo() {
		return paymentMadeTo;
	}

	public void setPaymentMadeTo(Roommate paymentMadeTo) {
		this.paymentMadeTo = paymentMadeTo;
	}
}
