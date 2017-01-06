package fr.insaship.collection;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Class used to map object to Company Two REST WS
 * 
 * @author Franck-Gravouil
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyTwoOfferMapping extends Offer {

	private static final long serialVersionUID = 2454496012325907877L;
	@JsonProperty(value="id")
	private int id;
	
	@JsonProperty(value="titre")
	private String title;
	
	@JsonProperty(value="contenu")
	private String description;
	
	public CompanyTwoOfferMapping(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	public CompanyTwoOfferMapping() {};
			
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
