package br.com.alura.gerenciador.servlet;

import java.util.Date;

public class Company {
	private Integer id;
	private String name;
	private Date openingDate = new Date();

	public Company(String name, Date date) {
		this.name = name;
		this.openingDate = date;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getOpeningDate() {
		return this.openingDate;
	}
	
	public void setOpeningDate(Date date) {
		this.openingDate = date;
	}
	
}
