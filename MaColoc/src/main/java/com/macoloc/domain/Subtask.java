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
public class Subtask extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "subtask_sequence_gen")
    @SequenceGenerator(name = "subtask_sequence_gen", sequenceName = "subtask_id_seq")
    private int id;
	
	@NotBlank
	private String name;
	
	@OneToOne
	private Task motherTask;
	
	@NotNull
	private Calendar startDay;
	
	private int numberOfDays;
	
	private String description;

	public Subtask() {
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

	public Task getMotherTask() {
		return motherTask;
	}

	public void setMotherTask(Task motherTask) {
		this.motherTask = motherTask;
	}
}
