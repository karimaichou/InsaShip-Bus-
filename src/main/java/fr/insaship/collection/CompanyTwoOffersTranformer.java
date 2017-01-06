package fr.insaship.collection;

import java.util.Arrays;
import java.util.List;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

/**
 * Construction of an object combining the company Two infos and its offers. 
 * 
 * @author Franck-Gravouil
 *
 */
public class CompanyTwoOffersTranformer extends AbstractMessageTransformer {
 
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		
		Offer[] offers =  (Offer[]) message.getPayload();
		Company companyOne = new Company(2, "Company Two", "http://Company Two logoUrl");
		
		CompanyOffers result = new CompanyOffers(companyOne, Arrays.asList(offers));
		
		return result;
	}
}
