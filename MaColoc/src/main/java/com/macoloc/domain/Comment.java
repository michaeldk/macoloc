package com.macoloc.domain;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author mdekeys
 * Comments on messages
 */
@Entity
public class Comment extends Versionable implements Notification {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "comment_sequence_gen")
    @SequenceGenerator(name = "comment_sequence_gen", sequenceName = "comment_id_seq")
	private int id;
	
	@NotNull
	@OneToOne
	private Roommate author;
	
	@NotNull
	private Calendar date;

	@NotBlank
	private String content;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the author
	 */
	public Roommate getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(Roommate author) {
		this.author = author;
	}

	/**
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public NotificationType getType() {
		return NotificationType.COMMENT;
	}

	@Override
	public String getSmallContent() {
		return author + " a laissé un commentaire sur le mur de la coloc'";
	}
}
