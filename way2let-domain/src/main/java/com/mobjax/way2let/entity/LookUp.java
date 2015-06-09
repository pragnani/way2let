package com.mobjax.way2let.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LookUp {

	@Id
	@GeneratedValue
	private Integer id;

	private Integer lookUpId;

	private String strDescription;

	private Integer masterId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLookUpId() {
		return lookUpId;
	}

	public void setLookUpId(Integer lookUpId) {
		this.lookUpId = lookUpId;
	}

	public String getStrDescription() {
		return strDescription;
	}

	public void setStrDescription(String strDescription) {
		this.strDescription = strDescription;
	}

	public Integer getMasterId() {
		return masterId;
	}

	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}
}
