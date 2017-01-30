package fr.insaship.collection;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class FinalOfferMapping implements Serializable {

	private static final long serialVersionUID = 2454496012325907877L;
	
	@JsonProperty(value="id")
	private int id;
	
	@JsonProperty(value="title")
	private String title;
	
	@JsonProperty(value="description")
	private String description;
	
	@JsonProperty(value="startdate")
	private String startdate;
	
	public FinalOfferMapping(int id, String title, String description, String startdate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.startdate = startdate;
	}
	
	public FinalOfferMapping() {};
	
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setId(int id) {
		this.id = id;	
	}
	
	public String getTitle() {
		// TODO Auto-generated method stub
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
}
