package com.macoloc.domain;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class Versionable implements Serializable {

	private static final long serialVersionUID = 1L;

	@Version
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
