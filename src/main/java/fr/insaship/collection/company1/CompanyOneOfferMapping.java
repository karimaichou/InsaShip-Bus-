package fr.insaship.collection.company1;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Class used to map object to Company One REST WS
 * 
 * @author Franck-Gravouil
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyOneOfferMapping implements Serializable {

	private static final long serialVersionUID = 2454496012325907877L;
	@JsonProperty(value="id")
	private int id;
	
	@JsonProperty(value="title")
	private String title;
	
	@JsonProperty(value="description")
	private String description;
	
	public CompanyOneOfferMapping(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	public CompanyOneOfferMapping(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Offer [id = " + id + ", title = " + title + ", description = " + description + "]";	
	}
	
}
