package com.macoloc.form;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.macoloc.form.annotation.FieldMatch;
import com.macoloc.form.generic.GenericForm;

@FieldMatch.List({
    @FieldMatch(first = "password", second = "confirmPassword", message = "Les mots de passe ne correspondent pas."),
    @FieldMatch(first = "email", second = "confirmEmail", message = "Les emails ne correspondent pas.")
})
public class CreateRoommateForm implements GenericForm {
	
	@NotEmpty(message="Veuillez indiquer votre prénom.")
	private String firstName;
	
	@NotEmpty(message="Veuillez indiquer votre nom.")
	private String lastName;
	
	@NotEmpty(message="Veuillez indiquer votre email.") @Email(message="Veuillez indiquer un email valide.")
	private String email;
	
	@NotEmpty(message="Veuillez confirmer votre email.") @Email(message="Veuillez indiquer un email valide.")
	private String confirmEmail;
	
	@NotEmpty(message="Veuillez choisir un mot de passe.")
	private String password;
	
	@NotEmpty(message="Veuillez confirmer votre mot de passe.")
	private String confirmPassword;

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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
}
