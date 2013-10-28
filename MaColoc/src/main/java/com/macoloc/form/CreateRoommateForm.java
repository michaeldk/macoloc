package com.macoloc.form;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import com.macoloc.form.generic.GenericForm;

public class CreateRoommateForm implements GenericForm {
	
	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	@NotNull @Email
	private String email;
	
	@NotNull
	private String password;
	
	@NotNull
	private Integer colocation_id;

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

	public Integer getColocation_id() {
		return colocation_id;
	}

	public void setColocation_id(Integer colocation_id) {
		this.colocation_id = colocation_id;
	}
}
