package com.macoloc.domain;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Payment extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "payment_sequence_gen")
    @SequenceGenerator(name = "payment_sequence_gen", sequenceName = "payment_id_seq")
    private int id;
	
	@NotNull
	@OneToOne
	private Roommate madeBy;
	
	private double amount;
	
	@NotNull
	private Calendar date;
	
	@NotNull
	@OneToOne
	private Colocation colocation;
	
	private boolean archived;
	
	@NotEmpty
    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
	private List<PaymentParticipation> paymentParticipations;

	public Payment() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Roommate getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(Roommate madeBy) {
		this.madeBy = madeBy;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public Colocation getColocation() {
		return colocation;
	}

	public void setColocation(Colocation colocation) {
		this.colocation = colocation;
	}

	public boolean isArchived() {
		return archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}
}
