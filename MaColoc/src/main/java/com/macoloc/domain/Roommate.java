package com.macoloc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class Roommate extends Versionable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "user_sequence_gen")
    @SequenceGenerator(name = "user_sequence_gen", sequenceName = "user_id_seq")
    private int id;
	
	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	@NotNull
	private String email;
	
	@NotNull
	private String password;
	
	@OneToOne
	private Colocation colocation;
	
	public Roommate() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Colocation getColocation() {
		return colocation;
	}

	public void setColocation(Colocation colocation) {
		this.colocation = colocation;
	}
	
	@Override
	public String toString() {
		return this.firstName;
	}
	
	public String toStringFull() {
		return this.firstName + " " + this.lastName;
	}
}
