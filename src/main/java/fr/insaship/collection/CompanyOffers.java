package fr.insaship.collection;

import java.io.Serializable;
import java.util.ArrayList;

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
	private ArrayList<FinalOfferMapping> offerList;
	
	public CompanyOffers() {}
	
	public CompanyOffers(Company company, ArrayList<FinalOfferMapping> offerList) {
		this.company = company;
		this.offerList = offerList;
	}
	
	public CompanyOffers(Company company, FinalOfferMapping offer) {
		this.company = company;
		this.offerList = new ArrayList<FinalOfferMapping>();
		this.offerList.add(offer);
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public ArrayList<FinalOfferMapping> getOfferList() {
		return offerList;
	}

	public void setOfferList(ArrayList<FinalOfferMapping> offerList) {
		this.offerList = offerList;
	}
	
}
