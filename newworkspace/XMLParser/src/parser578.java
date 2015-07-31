import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.rbcdexia.model.*;

public class parser578 {
public static void main(String args[])
{
	
	ACCOUNTIDType accountidType = new ACCOUNTIDType();
	ACCOUNTType accountType = new ACCOUNTType();
	AffirmationCustodyAdditionnalTradeInformationType affirmationCustodyAdditionnalTradeInformationType = new AffirmationCustodyAdditionnalTradeInformationType();
	AffirmationCustodyTradeDetailsType affirmationCustodyTradeDetailsType = new AffirmationCustodyTradeDetailsType();
	AffirmationCustodyType affirmationCustodyType = new AffirmationCustodyType();
	Allocation allocation = new Allocation();
	AllocationBlockDetailsType allocationBlockDetailsType = new AllocationBlockDetailsType();
	AmountsType amountsType = new AmountsType();
	AmountType amountType = new AmountType();
	//AmtQualifierType amtQualifierType = new AmtQualifierType();
	BICType bICType = new BICType();
	CANCELType cANCELType = new CANCELType();
	CLEARINGDETAILType cLEARINGDETAILType = new CLEARINGDETAILType();
	//DateQualifierType dateQualifierType = new DateQualifierType();
	DateType dateType = new DateType();
	DERIVATIVESType dERIVATIVESType = new DERIVATIVESType();
	//DomainType domainType = new DomainType();
	ExchangeRateType exchangeRateType = new ExchangeRateType();
	INTERESTType iNTERESTType = new INTERESTType();
	LINKAGEType lINKAGEType = new LINKAGEType();
	LINKEDDEALType lINKEDDEALType = new LINKEDDEALType();
	OTHERPARTYDEFINITIONType oTHERPARTYDEFINITIONType = new OTHERPARTYDEFINITIONType();
	//PartyQualifierType partyQualifierType = new PartyQualifierType();
	PARTYType pARTYType = new PARTYType();
	PRICEType pRICEType = new PRICEType();
	QuantityQualifierstype quantityQualifierstype = new QuantityQualifierstype();
	SECURITYType sECURITYType = new SECURITYType();
	SETTLEMENTPLACEType sETTLEMENTPLACEType = new SETTLEMENTPLACEType();
	SWIFTDETAILSType sWIFTDETAILSType = new SWIFTDETAILSType();
	TaxAndFeesType taxAndFeesType = new TaxAndFeesType();
	//TaxFeesQualifierType taxFeesQualifierType = new TaxFeesQualifierType();
	TRANSACTIONType tRANSACTIONType = new TRANSACTIONType();
	//UnitQualifierType unitQualifierType = new UnitQualifierType();
	UNITType uNITType = new UNITType();
	//YNType yNType = new YNType();
	
	
	try{
		
		
		FileInputStream fstream = new FileInputStream("578.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		String strLine;
		
		while((strLine=br.readLine())!=null)
		{
			//System.out.println(strLine.substring(0, 5));
			if(strLine.contains("16R")==true)
			{
				System.out.println("/*************  16R  *************/");
				System.out.println(accountidType.getBranchCode());
				System.out.println();
				//bICType.setBICId("U09CO231");
				System.out.println(bICType.getBICId());
				//System.out.println(strLine);
				
				//System.out.println(strLine.substring(5));
				
				
				
			}
			//System.out.println(strLine);
			
			if(strLine.contains("20C")==true)
			{
				System.out.println("/*************  20C  *************/");
				/*System.out.println(strLine.substring(6));
				System.out.println();*/
				//ArrayList<Field20C> field20C = (ArrayList<Field20C>)
				
			}
			
			if(strLine.contains("23G")==true)
			{
				System.out.println("/*************  23G  *************/");
				System.out.println(strLine.substring(5));
				System.out.println();
			}
			
			if(strLine.contains("98C")==true)
			{
				System.out.println("/*************  98C  *************/");
				System.out.println(strLine.substring(6));
				System.out.println();
			}
			
			if(strLine.contains("13A")==true)
			{
				System.out.println("/*************  13A  *************/");
				System.out.println(strLine.substring(6));
				System.out.println();
			}
			
			if(strLine.contains("16S")==true)
			{
				System.out.println("/*************  16s  *************/");
				System.out.println(strLine.substring(5));
				System.out.println();
			}
			
			if(strLine.contains("98A")==true)
			{
				/*if(strLine.contains("SETT"))
				{
					System.out.println("1");
				}
				if(strLine.contains("SETT"))
				{
					System.out.println("1");
				}*/
			}
			
			if(strLine.contains("90B")==true)
			{
				System.out.println("/*************  90B  *************/");
				System.out.println(strLine.substring(6));
				System.out.println();
			}
			
			if(strLine.contains("35B")==true)
			{
				System.out.println("/*************  35B  *************/");
				System.out.println(strLine.substring(5));
				System.out.println();
			}
			
			if(strLine.contains("22H")==true)
			{
				System.out.println("/*************  22H  *************/");
				System.out.println(strLine.substring(6));
				System.out.println();
			}
			
			if(strLine.contains("36B")==true)
			{
				System.out.println("/*************  36B  *************/");
				System.out.println(strLine.substring(6));
				System.out.println();
			}
			
			if(strLine.contains("97A")==true)
			{
				System.out.println("/*************  97A  *************/");
				System.out.println(strLine.substring(6));
				System.out.println();
			}
			
			if(strLine.contains("22F")==true)
			{
				System.out.println("/*************  22F  *************/");
				System.out.println(strLine.substring(6));
				System.out.println();
			}
			
			if(strLine.contains("95P")==true)
			{
				System.out.println("/*************  95P  *************/");
				System.out.println(strLine.substring(6));
				System.out.println();
			}
			
			if(strLine.contains("19A")==true)
			{
				//System.out.println("/*************  19A  *************/");
				/*System.out.println(strLine.substring(6));
				System.out.println();*/
				if(strLine.contains("SETT"))
				{
					System.out.println("1");
				}
				if(strLine.contains("ACRU"))
				{
					System.out.println("2");
				}
				if(strLine.contains("DEAL"))
				{
					System.out.println("3");
				}
			}
		}
		in.close();
	}
	catch(Exception e)
	{
		System.err.println("Error:"+e.getMessage());
	}

}
}
