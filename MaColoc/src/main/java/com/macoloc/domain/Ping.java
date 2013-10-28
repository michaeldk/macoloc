package com.macoloc.domain;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Ping extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "ping_sequence_gen")
    @SequenceGenerator(name = "ping_sequence_gen", sequenceName = "ping_id_seq")
    private int id;
	
    @OneToOne
	private Roommate pinger;
	
	@NotNull
	@OneToOne
	private TaskOrder taskOrder;
	
	@NotNull
	private Calendar date;

	public Ping() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Roommate getPinger() {
		return pinger;
	}

	public void setPinger(Roommate pinger) {
		this.pinger = pinger;
	}

	public TaskOrder getTaskOrder() {
		return taskOrder;
	}

	public void setTaskOrder(TaskOrder taskOrder) {
		this.taskOrder = taskOrder;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
}
