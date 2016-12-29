package fr.insaship.collection;

import java.util.Arrays;
import java.util.List;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class CompanyOneOffersTranformer extends AbstractMessageTransformer{
 

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		
		Offer[] offers =  (Offer[]) message.getPayload();
		Company companyOne = new Company(1, "Company One", "http://Company One logoUrl");
		
		CompanyOffers result = new CompanyOffers(companyOne, Arrays.asList(offers));
		
		return result;
	}
}
