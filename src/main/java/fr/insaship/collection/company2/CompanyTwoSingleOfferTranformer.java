package fr.insaship.collection.company2;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import fr.insaship.collection.Company;
import fr.insaship.collection.CompanyOffers;
import fr.insaship.collection.FinalOfferMapping;

/**
 * Construction of an object combining the company Two infos and its offers. 
 * 
 * @author Franck-Gravouil
 *
 */
public class CompanyTwoSingleOfferTranformer extends AbstractMessageTransformer {
 
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		
		CompanyTwoOfferMapping offer =  (CompanyTwoOfferMapping) message.getPayload();
		
		String companyID = muleContext.getRegistry().get("company2.id");
		String companyName = muleContext.getRegistry().get("company2.name");
		String companyLogoUrl = muleContext.getRegistry().get("company2.logourl");
	
		Company companyTwo= new Company(Integer.parseInt(companyID), companyName, companyLogoUrl);
		//String currentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
		
		FinalOfferMapping mappedOffer = new FinalOfferMapping(offer.getId(), offer.getTitle(), offer.getDescription(), offer.getStartdate());

		CompanyOffers result = new CompanyOffers(companyTwo, mappedOffer);
		
		return result;
	}
}
