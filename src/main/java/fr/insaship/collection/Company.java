package fr.insaship.collection;

import java.io.Serializable;

public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String logoUrl;
	
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

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public Company(int id, String name, String logoUrl) {
		super();
		this.id = id;
		this.name = name;
		this.logoUrl = logoUrl;
	}
	
}
