package com.macoloc.domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
public class Key extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "key_sequence_gen")
    @SequenceGenerator(name = "key_sequence_gen", sequenceName = "key_id_seq")
    private int id;
	
	@NotNull
	private String key;
	
	@NotNull
	private Calendar startDate;
	
	@NotNull
	private Calendar endDate;
	
    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
	private List<Coin> coins;

	public Key() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the coins
	 */
	public List<Coin> getCoins() {
		List<Coin> ret = new ArrayList<Coin>();
		for (Coin coin : this.coins) {
			ret.add(coin);
		}
		
		return ret;
	}

	/**
	 * @param coins the coins to set
	 */
	public void setCoins(List<Coin> coins) {
		this.coins = coins;
	}
	
	public void addCoin(Coin coin) {
		this.coins.add(coin);
	}
	
	public void addAllCoins(List<Coin> coins) {
		this.coins.addAll(coins);
	}

}
