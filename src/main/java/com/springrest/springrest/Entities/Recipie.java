package com.springrest.springrest.Entities;

public class Recipie {

	
	private long id;
	private String tittle;
	private String description;
	
	@Override
	public String toString() {
		return "Recipie [id=" + id + ", tittle=" + tittle + ", description=" + description + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Recipie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recipie(long id, String tittle, String description) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.description = description;
	}
	
	
	 
}
