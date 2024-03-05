package com.bank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Citizen {

	@Id
	private String addharId;
	private String panId;
	private String name;
	
	@Override
	public String toString() {
		return "Citizen [addharId=" + addharId + ", panId=" + panId + ", name=" + name + "]";
	}
	
	public Citizen() {
		super();
	}
	
	public Citizen(String addharId, String panId, String name) {
		super();
		this.addharId = addharId;
		this.panId = panId;
		this.name = name;
	}
	public String getAddharId() {
		return addharId;
	}
	public void setAddharId(String addharId) {
		this.addharId = addharId;
	}
	public String getPanId() {
		return panId;
	}
	public void setPanId(String panId) {
		this.panId = panId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
