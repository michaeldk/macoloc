package com.macoloc.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class ColocationTodoList extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "colocationtodolist_sequence_gen")
    @SequenceGenerator(name = "colocationtodolist_sequence_gen", sequenceName = "colocationtodolist_id_seq")
	private int id;
	
	@OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
	private List<Task> tasks;
	
	@OneToOne
	private Colocation colocation;
	
	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Colocation getColocation() {
		return colocation;
	}

	public void setColocation(Colocation colocation) {
		this.colocation = colocation;
	}

	public ColocationTodoList() {
		super();
	}

}
