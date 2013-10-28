package com.macoloc.domain;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Task extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "task_sequence_gen")
    @SequenceGenerator(name = "task_sequence_gen", sequenceName = "task_id_seq")
    private int id;
	
	@NotBlank
	private String name;
	
	private Calendar startDay;
	
	private int numberOfDays;
	
	private String description;
	
	@NotNull
	@OneToOne
	private Colocation colocation;
	
	private Rotation rotation;
	
	public Task() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getStartDay() {
		return startDay;
	}

	public void setStartDay(Calendar startDay) {
		this.startDay = startDay;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Colocation getColocation() {
		return colocation;
	}

	public void setColocation(Colocation colocation) {
		this.colocation = colocation;
	}

	public Rotation getRotation() {
		return rotation;
	}

	public void setRotation(Rotation rotation) {
		this.rotation = rotation;
	}
}
