package com.macoloc.form;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.macoloc.form.generic.GenericForm;

public class CreateCommentForm implements GenericForm {
	
	@NotNull
	private Integer author_id;
	
	@NotBlank
	private String content;
	
	@NotNull
	private Integer colocation_id;
	
	@NotNull
	private Date date;

	public Integer getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(Integer author_id) {
		this.author_id = author_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getColocation_id() {
		return colocation_id;
	}

	public void setColocation_id(Integer colocation_id) {
		this.colocation_id = colocation_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
