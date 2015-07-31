
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.rbcdexia.model.ACCOUNTIDType;
import com.rbcdexia.model.ACCOUNTType;
import com.rbcdexia.model.AffirmationCustodyAdditionnalTradeInformationType;
import com.rbcdexia.model.AffirmationCustodyTradeDetailsType;
import com.rbcdexia.model.AffirmationCustodyType;
import com.rbcdexia.model.AmountType;
import com.rbcdexia.model.AmountsType;
import com.rbcdexia.model.AmtQualifierType;
import com.rbcdexia.model.CANCELType;
import com.rbcdexia.model.DateQualifierType;
import com.rbcdexia.model.DateType;
import com.rbcdexia.model.LINKAGEType;
import com.rbcdexia.model.PRICEType;
import com.rbcdexia.model.QuantityQualifierstype;
import com.rbcdexia.model.SECURITYType;
import com.rbcdexia.model.SWIFTDETAILSType;
import com.rbcdexia.model.TRANSACTIONType;
import com.rbcdexia.model.TaxAndFeesType;
import com.rbcdexia.model.TaxFeesQualifierType;
import com.rbcdexia.model.UNITType;
import com.rbcdexia.model.UnitQualifierType;

public class MT578 {
public static void main(String args[])
{
	
	/*String messageContent = "{1:F01ROYCCAT2FXXX0270758413}{2:I578MGTCBEBEXXXXN}{4:" + "\n" +                         
":16R:GENL" + "\n" +                                                                    
":20C::SEME//RBC1112170030276" + "\n" +                                                  
":23G:REMO" + "\n" +                                                                      
":98C::PREP//20110810011049" + "\n" +                                                     
":16R:LINK" + "\n" +                                                                      
":13A::LINK//578" + "\n" +                                                                
":20C::PREV//RBC1112170030276" + "\n" +                                                   
":16S:LINK" + "\n" +                                                                      
":16S:GENL" + "\n" +                                                                      
":16R:TRADDET" + "\n" +                                                                   
":98A::SETT//20110810" + "\n" +                                                           
":90B::DEAL//ACTU/CAD154.360000" + "\n" +                                                                                                                    
":22H::PAYM//APMT" + "\n" +                                                              
":22H::REDE//RECE"  + "\n" +                                                              
":16S:TRADDET"  + "\n" +                                                                  
":16R:FIAC"  + "\n" +                                                                     
":36B::SETT//FAMT/900000."  + "\n" +                                                      
":97A::SAFE//T12853091" + "\n" +                                                          
":16S:FIAC" + "\n" +                                                                      
":16R:SETDET" + "\n" +                                                                    
":22F::SETR//TRAD" + "\n" +                                                               
":16R:SETPRTY"  + "\n" +                                                                  
":95P::REAG//MLCICATT" + "\n" +                                                           
":97A::SAFE//2774065" + "\n" +                                                            
":16S:SETPRTY" + "\n" +                                                                   
":16R:AMT"  + "\n" +                                                                      
":19A::SETT//USD1403048.22" + "\n" +                                                      
":16S:AMT" + "\n" +                                                                       
":16R:AMT" + "\n" +                                                                       
":19A::ACRU//CAD13808.22"  + "\n" +                                                       
":16S:AMT"  + "\n" +                                                                      
":16R:AMT"  + "\n" +                                                                      
":19A::DEAL//GBP1389240." + "\n" +
":16S:AMT" + "\n" +                                                                       
":16S:SETDET" + "\n" +                                                                    
"-}{5:{CHK:991D66CF68D6}}";*/
	
	
	try
	{
		
		FileInputStream fstream = new FileInputStream("D:\\ProgramData\\KarshanProject\\src\\xsd\\in.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		String messageContent;
		String messageArray[] = new String[50];
		messageContent = br.readLine();
		int j=0;
		while(messageContent != null)
		{
			
			System.out.println(messageContent);
			messageArray[j]=messageContent;
			messageContent = br.readLine();
			j++;
		}
		in.close();
		
		  	
	
	//String messageArray[] = messageContent.split("\\n");
	//String operation = null;
	
	
	AffirmationCustodyAdditionnalTradeInformationType affirmationCustodyAdditionnalTradeInformationType = new AffirmationCustodyAdditionnalTradeInformationType();
	AffirmationCustodyTradeDetailsType affirmationCustodyTradeDetailsType = new AffirmationCustodyTradeDetailsType();
	AffirmationCustodyType affirmationCustodyType = new AffirmationCustodyType();
	DateType dateType = new DateType();
	AmountType amountType = new AmountType();
	PRICEType priceType = new PRICEType();
	TRANSACTIONType transactionType = new TRANSACTIONType();
	
	SWIFTDETAILSType swiftdetailsType = new SWIFTDETAILSType();
	QuantityQualifierstype quantityQualifierstype = new QuantityQualifierstype();
	SECURITYType securityType = new SECURITYType();
	ACCOUNTType accountType = new ACCOUNTType();
	ACCOUNTIDType accountidType = new ACCOUNTIDType();
	AmountsType amountsType = new AmountsType();
	CANCELType cancelType = new CANCELType();
	LINKAGEType linkageType = new LINKAGEType();
	UNITType unitType = new UNITType();
	TaxAndFeesType taxAndFeesType = new TaxAndFeesType();
	
	JAXBContext jaxbContext = JAXBContext.newInstance(AffirmationCustodyType.class);
	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	
	jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
	
	
	for(int i=0;i<messageArray.length;i++)
	{
		String strLines = messageArray[i];
		String buffer = strLines.trim();
		if(buffer.length()>2)
		{
			String strLine = buffer.substring(1, 4);
			//System.out.println(strLine);
			/*if(strLine.equals("98A"))
			{
				System.out.println("98A BLOCK");
				
				String block98A[] = messageArray[i].split("//");
				String date = block98A[1].trim();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
				Date dDate;
				try {
					dDate = dateFormat.parse(date);
				GregorianCalendar gregory = new GregorianCalendar(); 
				gregory.setTime(dDate);
				XMLGregorianCalendar Dt = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
				
				
				if(messageArray[i].substring(6, 10).equals("SETT"))
				{
					//affirmationCustodyType.getTradeDetails();
					//affirmationCustodyTradeDetailsType.getDateDetails();
					dateType.setDt(Dt);
					dateType.setDateQualifier(DateQualifierType.STTLM_DT);
					//affirmationCustodyTradeDetailsType.getDateDetails().add(dateType);
					
					//affirmationCustodyType.getTradeDetails().getDateDetails().add(dateType);
					securityType.setDateDetails(dateType);
					affirmationCustodyTradeDetailsType.getDateDetails();
					affirmationCustodyType.setTradeDetails(affirmationCustodyTradeDetailsType);
					
					
				}
				if(messageArray[i].substring(6, 10).equals("TRAD"))
				{
					dateType.setDt(Dt);
					dateType.setDateQualifier(DateQualifierType.TRAD_DT);
					//affirmationCustodyTradeDetailsType.getDateDetails().add(dateType);
					//affirmationCustodyType.getTradeDetails().getDateDetails().add(dateType);
					
					securityType.setDateDetails(dateType);
					affirmationCustodyTradeDetailsType.getDateDetails();
					affirmationCustodyType.setTradeDetails(affirmationCustodyTradeDetailsType);
					
				}
				
				if(messageArray[i].substring(6, 10).equals("MATU"))
				{
					dateType.setDt(Dt);
					dateType.setDateQualifier(DateQualifierType.MATURITY_DT);
					//affirmationCustodyTradeDetailsType.getDateDetails().add(dateType);
					//affirmationCustodyType.getTradeDetails().getDateDetails().add(dateType);
					
					securityType.setDateDetails(dateType);
					affirmationCustodyTradeDetailsType.getDateDetails();
					affirmationCustodyType.setTradeDetails(affirmationCustodyTradeDetailsType);
					
				}
				System.out.println(Dt);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DatatypeConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
			
			if(strLine.equals("20C"))
			{
				
				
				if(messageArray[i].substring(6, 10).equals("SEME"))
				{
					String block20C[] = messageArray[i].split("//");
					String depositoryRef = block20C[1];
					
					affirmationCustodyAdditionnalTradeInformationType.setDepositoryRef(depositoryRef);
					affirmationCustodyType.setAdditionnalInfo(affirmationCustodyAdditionnalTradeInformationType);
					
				}
				
				if(messageArray[i].substring(6, 10).equals("PREV"))
				{
					String block20C[] = messageArray[i].split("//");
					String RelatedRef = block20C[1];
					
					affirmationCustodyAdditionnalTradeInformationType.setDepositoryRef(RelatedRef);
					affirmationCustodyType.setAdditionnalInfo(affirmationCustodyAdditionnalTradeInformationType);
					
					cancelType.setRelatedRef(RelatedRef);
					linkageType.setCancel(cancelType);
					affirmationCustodyType.setLinkages(linkageType);
					
				}
				
				if(messageArray[i].substring(6, 10).equals("RELA"))
				{
					String block20C[] = messageArray[i].split("//");
					String LinkedTradeRef = block20C[1];
					
					affirmationCustodyAdditionnalTradeInformationType.setDepositoryRef(LinkedTradeRef);
					affirmationCustodyType.setAdditionnalInfo(affirmationCustodyAdditionnalTradeInformationType);
					
					cancelType.setLinkedRef(LinkedTradeRef);
					linkageType.setCancel(cancelType);
					affirmationCustodyType.setLinkages(linkageType);
					
				}
			}
			
			if(strLine.equals("90B"))
			{
				
				
				String block90BA[] = messageArray[i].split("//");
				String block90BB[] = block90BA[1].split("/");
				
				String PriceCcy = block90BB[1].substring(0, 3);
				String price = block90BB[1].substring(3);
				BigDecimal Price = new BigDecimal(price);
				
				priceType.setPriceCcy(PriceCcy);
				priceType.setPrice(Price);
				
				
				affirmationCustodyTradeDetailsType.setPriceDetails(priceType);
				
				
				
				}
			
			if(strLine.equals("22H"))
			{
				
				
				
				if(((messageArray[i].substring(6, 10).equals("PAYM")) && (messageArray[i].substring(12, 16).equals("FREE"))) &&
						((messageArray[i].substring(6, 10).equals("REDE")) && (messageArray[i].substring(12, 16).equals("RECE"))))
				{
					transactionType.setOperationType("AFFIRM_DF");
				}
				
				if(((messageArray[i].substring(6, 10).equals("PAYM")) && (messageArray[i].substring(12, 16).equals("FREE"))) &&
						((messageArray[i].substring(6, 10).equals("REDE")) && (messageArray[i].substring(12, 16).equals("DELI"))))
				{
					transactionType.setOperationType("AFFIRM_RF");
				}
				
				
				if(((messageArray[i].substring(6, 10).equals("PAYM")) && (messageArray[i].substring(12, 16).equals("APMT"))) &&
						((messageArray[i].substring(6, 10).equals("REDE")) && (messageArray[i].substring(12, 16).equals("RECE"))))
				{
					transactionType.setOperationType("AFFIRM_DVP");
				}
				
				if(((messageArray[i].substring(6, 10).equals("PAYM")) && (messageArray[i].substring(12, 16).equals("APMT"))) &&
						((messageArray[i].substring(6, 10).equals("REDE")) && (messageArray[i].substring(12, 16).equals("DELI"))))
				{
					transactionType.setOperationType("AFFIRM_RVP");
				}
			}
			
			
			
			if(strLine.equals("36B"))
			{
				
				
				String block36BA[] = messageArray[i].split("//");
				String block36BB[] = block36BA[1].split("/");
				String unitValue = block36BB[1].trim();
				BigDecimal UnitValue = new BigDecimal(unitValue);
				String QuantityQualifier = block36BB[0].trim();
				if(block36BB[0].equals("FAMT"))
				{
				UnitQualifierType unitQualifier = UnitQualifierType.QTY;
				unitType.setUnitQualifier(UnitQualifierType.QTY);
				unitType.setUnitValue(UnitValue);
				affirmationCustodyTradeDetailsType.setUnitDetails(unitType);
				affirmationCustodyType.setTradeDetails(affirmationCustodyTradeDetailsType);
				
				quantityQualifierstype.setQuantityQualifier(QuantityQualifier);
				swiftdetailsType.setQuantityQualifiers(quantityQualifierstype);
				affirmationCustodyTradeDetailsType.setSwiftDetails(swiftdetailsType);
				}
				
				if(block36BB[0].equals("UNIT"))
				{
				UnitQualifierType unitQualifier = UnitQualifierType.QTY;
				unitType.setUnitQualifier(UnitQualifierType.QTY);
				unitType.setUnitValue(UnitValue);
				affirmationCustodyTradeDetailsType.setUnitDetails(unitType);
				affirmationCustodyType.setTradeDetails(affirmationCustodyTradeDetailsType);
				
				quantityQualifierstype.setQuantityQualifier(QuantityQualifier);
				swiftdetailsType.setQuantityQualifiers(quantityQualifierstype);
				affirmationCustodyTradeDetailsType.setSwiftDetails(swiftdetailsType);
				}
				
				if(block36BB[0].equals("AMOR"))
				{
					String amortizedValue = block36BB[1].trim();
					BigDecimal AmortizedValue = new BigDecimal(amortizedValue);
					
					securityType.setAmortisedValue(AmortizedValue);
					affirmationCustodyType.setSecurity(securityType);
				
				quantityQualifierstype.setQuantityQualifier(QuantityQualifier);
				swiftdetailsType.setQuantityQualifiers(quantityQualifierstype);
				affirmationCustodyTradeDetailsType.setSwiftDetails(swiftdetailsType);
				
				
				}
				
			}
			
			if(strLine.equals("22F"))
			{
				
				
				if((messageArray[i].substring(6, 10).equals("SETR")) && (messageArray[i].substring(12, 16).equals("OWNI")))
				{
					int AccountTransfer = 0;
					
					
				}
			}
			
			if(strLine.equals("97A"))
			{
				
				
				String block97A[] = messageArray[i].split("//");
				String AccountId = block97A[1].trim();
				String AccountCode = block97A[1].trim();
				
				accountType.setAccountCode(AccountCode);
				accountidType.setAccountId(AccountId);
				accountType.setAccountDef(accountidType);
				affirmationCustodyTradeDetailsType.setAccountDetails(accountType);
				
				
			}
			
			if(strLine.equals("19A"))
			{
				
				String block19A[] = messageArray[i].split("//");
				if(messageArray[i].substring(6, 10).equals("SETT"))
				{
					String AmtCcy = block19A[1].substring(0, 3);
					String amtValue = block19A[1].substring(3);
					BigDecimal AmtValue = new BigDecimal(amtValue);
					
					amountType.setAmtCcy(AmtCcy);
					amountType.setAmtValue(AmtValue);
					amountType.setAmtQualifier(AmtQualifierType.STTLM_AMT);
					amountsType.getAmtDetails().add(amountType);
					
				}
				
				if(messageArray[i].substring(6, 10).equals("RESU"))
				{
					String AmtCcy = block19A[1].substring(0, 3);
					String amtValue = block19A[1].substring(3);
					BigDecimal AmtValue = new BigDecimal(amtValue);
					
					amountType.setAmtCcy(AmtCcy);
					amountType.setAmtValue(AmtValue);
					amountType.setAmtQualifier(AmtQualifierType.NET_AMT);
					amountsType.getAmtDetails().add(amountType);
				}
				
				if(messageArray[i].substring(6,10).equals("ACRU"))
				{
					String AmtCcy = block19A[1].substring(0, 3);
					String amtValue = block19A[1].substring(3);
					BigDecimal AmtValue = new BigDecimal(amtValue);
					
					amountType.setAmtCcy(AmtCcy);
					amountType.setAmtValue(AmtValue);
					amountType.setAmtQualifier(AmtQualifierType.ACCR_INTEREST_AMT);
					amountsType.getAmtDetails().add(amountType);
				}
				
				if(messageArray[i].substring(6,10).equals("DEAL"))
				{
					String AmtCcy = block19A[1].substring(0, 3);
					String amtValue = block19A[1].substring(3);
					BigDecimal AmtValue = new BigDecimal(amtValue);
					
					amountType.setAmtCcy(AmtCcy);
					amountType.setAmtValue(AmtValue);
					amountType.setAmtQualifier(AmtQualifierType.GRSS_AMT);
					amountsType.getAmtDetails().add(amountType);
				}
				
				if((messageArray[i].substring(6, 10).equals("EXEC")) || (messageArray[i].substring(6, 10).equals("LOCO")) || (messageArray[i].substring(6, 10).equals("OTHR")) )
				{
					String TaxFeesCcy = block19A[1].substring(0, 3);
					String taxFeesAmtValue = block19A[1].substring(3);
					BigDecimal TaxFeesAmtValue = new BigDecimal(taxFeesAmtValue);
					
					taxAndFeesType.setTaxFeesCcy(TaxFeesCcy);
					taxAndFeesType.setTaxFeesAmtValue(TaxFeesAmtValue);
					taxAndFeesType.setTaxFeesQualifier(TaxFeesQualifierType.BROKER_FEES);
					affirmationCustodyTradeDetailsType.getTaxAndFees().add(taxAndFeesType);
					
				}
				
				if((messageArray[i].substring(6, 10).equals("COUN")) || (messageArray[i].substring(6, 10).equals("LEVY")) || (messageArray[i].substring(6, 10).equals("LOCL")) || (messageArray[i].substring(6, 10).equals("VATA")) || (messageArray[i].substring(6, 10).equals("WITH")) )
				{
					String TaxFeesCcy = block19A[1].substring(0, 3);
					String taxFeesAmtValue = block19A[1].substring(3);
					BigDecimal TaxFeesAmtValue = new BigDecimal(taxFeesAmtValue);
					
					taxAndFeesType.setTaxFeesCcy(TaxFeesCcy);
					taxAndFeesType.setTaxFeesAmtValue(TaxFeesAmtValue);
					taxAndFeesType.setTaxFeesQualifier(TaxFeesQualifierType.TAX_FEES);
					affirmationCustodyTradeDetailsType.getTaxAndFees().add(taxAndFeesType);
					
				}
				
				if((messageArray[i].substring(6, 10).equals("CHAR")) || (messageArray[i].substring(6, 10).equals("REGF")) || (messageArray[i].substring(6, 10).equals("STEX")) || (messageArray[i].substring(6, 10).equals("TRAN")) || (messageArray[i].substring(6, 10).equals("TRAX")))
				{
					String TaxFeesCcy = block19A[1].substring(0, 3);
					String taxFeesAmtValue = block19A[1].substring(3);
					BigDecimal TaxFeesAmtValue = new BigDecimal(taxFeesAmtValue);
					
					taxAndFeesType.setTaxFeesCcy(TaxFeesCcy);
					taxAndFeesType.setTaxFeesAmtValue(TaxFeesAmtValue);
					taxAndFeesType.setTaxFeesQualifier(TaxFeesQualifierType.OTHER_FEES);
					affirmationCustodyTradeDetailsType.getTaxAndFees().add(taxAndFeesType);
					
				}
				
				if((messageArray[i].substring(6, 10).equals("STAM")) )
				{
					String TaxFeesCcy = block19A[1].substring(0, 3);
					String taxFeesAmtValue = block19A[1].substring(3);
					BigDecimal TaxFeesAmtValue = new BigDecimal(taxFeesAmtValue);
					
					taxAndFeesType.setTaxFeesCcy(TaxFeesCcy);
					taxAndFeesType.setTaxFeesAmtValue(TaxFeesAmtValue);
					taxAndFeesType.setTaxFeesQualifier(TaxFeesQualifierType.STAMP_FEES);
					affirmationCustodyTradeDetailsType.getTaxAndFees().add(taxAndFeesType);
					
				}
				
				affirmationCustodyTradeDetailsType.setAmounts(amountsType);
				
			}
			
			if(strLine.equals("90A"))
			{
				
				
				String block90AA[] = messageArray[i].split("//");
				String block90AB[] = block90AA[1].split("/");
				
				String PriceCcy = block90AB[1].substring(0, 3);
				String price = block90AB[1].substring(3);
				BigDecimal Price = new BigDecimal(price);
				
				priceType.setPriceCcy(PriceCcy);
				priceType.setPrice(Price);
				
				affirmationCustodyTradeDetailsType.setPriceDetails(priceType);
				
			}
			
			if(strLine.equals("92A"))
			{
				
				
				String block92A[] = messageArray[i].split("//");
				String poolFactor = block92A[1].trim();
				BigDecimal PoolFactor = new BigDecimal(poolFactor);
				
				String interestRate = block92A[1].trim();
				BigDecimal InterestRate = new BigDecimal(interestRate);
				
				if(messageArray[i].substring(6,10).equals("CUFC"))
				{
					securityType.setPoolFactor(PoolFactor);
					
					
				}
				
				if(messageArray[i].substring(6,10).equals("INTR"))
				{
					securityType.setInterestRate(InterestRate);
					
					
				}
			}
			
			if(strLine.equals("70E"))
			{
				
				
				String block70E[] = messageArray[i].split("//");
				
				String Comment = block70E[1];
				affirmationCustodyType.setComment(Comment);
				
			}
			
			
			affirmationCustodyType.setTradeDetails(affirmationCustodyTradeDetailsType);
			affirmationCustodyType.setAdditionnalInfo(affirmationCustodyAdditionnalTradeInformationType);
			affirmationCustodyType.setSecurity(securityType);
			affirmationCustodyType.setLinkages(linkageType);
			
		}
	}
	jaxbMarshaller.marshal(affirmationCustodyType, System.out);
	}
	catch (Exception e) {
		System.out.println(e.toString());
		//TODO: handle exception
	}
}
}

