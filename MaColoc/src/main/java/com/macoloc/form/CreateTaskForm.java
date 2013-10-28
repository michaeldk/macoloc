package com.macoloc.form;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.macoloc.form.generic.GenericForm;

public class CreateTaskForm implements GenericForm {

	@NotBlank @NotNull
	private String name;
	
	@NotNull
	private boolean rotation;
	
	@NotNull
	private Date startDay;
	
	@NotNull
	private Integer numberOfDays;
	
	@NotBlank @NotNull
	private String description;
	
	@NotNull
	private Integer colocation_id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRotation() {
		return rotation;
	}

	public void setRotation(boolean rotation) {
		this.rotation = rotation;
	}

	public Date getStartDay() {
		return startDay;
	}

	public void setStartDay(Date startDay) {
		this.startDay = startDay;
	}

	public Integer getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(Integer numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getColocation_id() {
		return colocation_id;
	}

	public void setColocation_id(Integer colocation_id) {
		this.colocation_id = colocation_id;
	}
}
