package com.macoloc.form;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.macoloc.form.generic.GenericForm;

public class CreatePaymentForm implements GenericForm {
	
	@NotNull
	private Integer madeByUser_id;
	
	@NotNull
	private Double amount;
	
	@NotNull
	private Date date;
	
	@NotNull
	private Integer colocation_id;
	
	private boolean archived;

	public Integer getMadeByUser_id() {
		return madeByUser_id;
	}

	public void setMadeByUser_id(Integer madeByUser_id) {
		this.madeByUser_id = madeByUser_id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getColocation_id() {
		return colocation_id;
	}

	public void setColocation_id(Integer colocation_id) {
		this.colocation_id = colocation_id;
	}

	public boolean isArchived() {
		return archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}
}
