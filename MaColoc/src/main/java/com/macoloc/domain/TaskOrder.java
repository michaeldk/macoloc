package com.macoloc.domain;

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
public class TaskOrder extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "taskorder_sequence_gen")
    @SequenceGenerator(name = "taskorder_sequence_gen", sequenceName = "taskorder_id_seq")
    private int id;
	
	@NotEmpty
    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
	private List<Roommate> doers;
	
	@NotEmpty
    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
	private List<Ping> pings;
	
	@NotNull
	@OneToOne
	private Task task;
	
	@NotNull
	@OneToOne
	private TaskOrder nextTaskOrder;
	
	private boolean done;
	
	private int daysLeft;

	public TaskOrder() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Roommate> getDoers() {
		return doers;
	}

	public void setDoers(List<Roommate> doers) {
		this.doers = doers;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public TaskOrder getNextTaskOrder() {
		return nextTaskOrder;
	}

	public void setNextTaskOrder(TaskOrder nextTaskOrder) {
		this.nextTaskOrder = nextTaskOrder;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public List<Ping> getPings() {
		return pings;
	}

	public void setPings(List<Ping> pings) {
		this.pings = pings;
	}

	public int getDaysLeft() {
		return daysLeft;
	}

	public void setDaysLeft(int daysLeft) {
		this.daysLeft = daysLeft;
	}
}
