package com.macoloc.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class ColocationList extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "colocationlist_sequence_gen")
    @SequenceGenerator(name = "colocationlist_sequence_gen", sequenceName = "colocationlist_id_seq")
	private int id;
	
	@OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
	private ArrayList<ListObject> list = new ArrayList<ListObject>();
    
    @NotNull
	@OneToOne
	private Colocation colocation;
    
    @NotNull
    private String name;
    
    public ColocationList() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<ListObject> getList() {
		return list;
	}

	public void setList(ArrayList<ListObject> list) {
		this.list = list;
	}

	public Colocation getColocation() {
		return colocation;
	}

	public void setColocation(Colocation colocation) {
		this.colocation = colocation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isDone() {
		for (ListObject listObject : this.list) {
			if (!listObject.isDone()) {
				return false;
			}
		}
		return true;
	}
}
