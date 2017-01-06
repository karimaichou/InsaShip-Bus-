package fr.insaship.collection;

import java.io.Serializable;
import java.util.List;

/**
 * Class used to combine company information and offers retrieved from Company WS.
 * 
 * @author Franck-Gravouil
 *
 */
public class  CompanyOffers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Company company;
	private List<Offer> offerList;
	
	public CompanyOffers() {}
	
	public CompanyOffers(Company company, List<Offer> offerList) {
		this.company = company;
		this.offerList = offerList;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Offer> getOfferList() {
		return offerList;
	}

	public void setOfferList(List<Offer> offerList) {
		this.offerList = offerList;
	}
	
}
