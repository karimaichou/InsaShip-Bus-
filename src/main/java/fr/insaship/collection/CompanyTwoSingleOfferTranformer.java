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
public class CompanyTwoSingleOfferTranformer extends AbstractMessageTransformer {
 
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		
		Offer offer =  (Offer) message.getPayload();
		
		String companyID = muleContext.getRegistry().get("company2.id");
		String companyName = muleContext.getRegistry().get("company2.name");
		String companyLogoUrl = muleContext.getRegistry().get("company2.logourl");
	
		Company companyTwo= new Company(Integer.parseInt(companyID), companyName, companyLogoUrl);
		
		CompanyOffers result = new CompanyOffers(companyTwo, Arrays.asList(offer));
		
		return result;
	}
}
