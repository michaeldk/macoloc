package com.macoloc.domain;

import java.util.Calendar;
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
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Message extends Versionable implements Notification {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "message_sequence_gen")
    @SequenceGenerator(name = "message_sequence_gen", sequenceName = "message_id_seq")
    private int id;
	
	@NotNull
	@OneToOne
	private Roommate author;
	
	@NotNull
	@OneToOne
	private Colocation colocation;
	
	@NotEmpty
    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
	private List<MessageSeenBy> messageSeenBy;
	
	@NotEmpty
    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
	private List<Comment> comments;
	
	@NotBlank
	private String content;
	
	@NotNull
	private Calendar date;

	public Message() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Roommate getAuthor() {
		return author;
	}

	public void setAuthor(Roommate author) {
		this.author = author;
	}

	public Colocation getColocation() {
		return colocation;
	}

	public void setColocation(Colocation colocation) {
		this.colocation = colocation;
	}

	public List<MessageSeenBy> getMessageSeenBy() {
		return messageSeenBy;
	}

	public void setMessageSeenBy(List<MessageSeenBy> messageSeenBy) {
		this.messageSeenBy = messageSeenBy;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	@Override
	public NotificationType getType() {
		return NotificationType.MESSAGE;
	}

	@Override
	public String getSmallContent() {
		return author + " a posté un message sur le mur de la coloc'";
	}

}
