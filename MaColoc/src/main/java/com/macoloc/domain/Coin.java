package com.macoloc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;


@Entity
public class Coin extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "coin_sequence_gen")
    @SequenceGenerator(name = "coin_sequence_gen", sequenceName = "coin_id_seq")
    private int id;
	
	@NotNull
	private CoinType type;
	
	public Coin() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
