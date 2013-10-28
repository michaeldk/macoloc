package com.macoloc.form;

import org.hibernate.validator.constraints.NotBlank;

import com.macoloc.domain.Key;
import com.macoloc.form.generic.GenericForm;

public class CreateColocationForm implements GenericForm {
	
	@NotBlank
	private String name;
	
	private Key key;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
}
