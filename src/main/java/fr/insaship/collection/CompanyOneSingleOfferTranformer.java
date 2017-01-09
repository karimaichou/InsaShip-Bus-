package fr.insaship.collection;

import java.util.Arrays;
import java.util.List;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

/**
 * Construction of an object combining the company One infos and its offers. 
 * 
 * @author Franck-Gravouil
 *
 */
public class CompanyOneSingleOfferTranformer extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		
		Offer offer =  (Offer) message.getPayload();
		
		String companyID = muleContext.getRegistry().get("company1.id");
		String companyName = muleContext.getRegistry().get("company1.name");
		String companyLogoUrl = muleContext.getRegistry().get("company1.logourl");
	
		Company companyOne = new Company(Integer.parseInt(companyID), companyName, companyLogoUrl);
		
		CompanyOffers result = new CompanyOffers(companyOne, Arrays.asList(offer));
		
		return result;
	}
}
