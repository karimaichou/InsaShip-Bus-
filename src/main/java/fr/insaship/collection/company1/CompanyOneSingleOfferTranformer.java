package fr.insaship.collection.company1;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import fr.insaship.collection.Company;
import fr.insaship.collection.CompanyOffers;
import fr.insaship.collection.FinalOfferMapping;

/**
 * Construction of an object combining the company One infos and its offers. 
 * 
 * @author Franck-Gravouil
 *
 */
public class CompanyOneSingleOfferTranformer extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		
		CompanyOneOfferMapping offer =  (CompanyOneOfferMapping) message.getPayload();
		
		String companyID = muleContext.getRegistry().get("company1.id");
		String companyName = muleContext.getRegistry().get("company1.name");
		String companyLogoUrl = muleContext.getRegistry().get("company1.logourl");
	
		Company companyOne = new Company(Integer.parseInt(companyID), companyName, companyLogoUrl);
		
		FinalOfferMapping mappedOffer = new FinalOfferMapping(offer.getId(), offer.getTitle(), offer.getDescription(), offer.getStartdate());

		CompanyOffers result = new CompanyOffers(companyOne, mappedOffer);
		
		return result;
	}
}
