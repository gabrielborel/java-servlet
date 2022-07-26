package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Database {

	private static List<Company> companies = new ArrayList<>();
	private static Integer sequentialKey = 1;
	
	static {
		var company0 = new Company("Google", new Date());
		company0.setId(Database.sequentialKey++);
		var company1 = new Company("Meta", new Date());
		company1.setId(Database.sequentialKey++);
		
		companies.add(company0);
		companies.add(company1);
	}
	
	public void add(Company company) {
		company.setId(Database.sequentialKey++);
		Database.companies.add(company);	
	}
	
	public void remove(Integer id) {
		Iterator<Company> iterator = Database.companies.iterator();
		
		while(iterator.hasNext()) {
			Company company = iterator.next();
			
			if (company.getId() == id) {
				iterator.remove();
			}
		}
	}	
	
	public Company findById(Integer id) {
		for (Company company : companies) {
			if (company.getId() == id) {
				return company;
			}
		}
		
		return null;
	}
	
	public List<Company> getCompanies() {
		return Database.companies;
	}
	
}
