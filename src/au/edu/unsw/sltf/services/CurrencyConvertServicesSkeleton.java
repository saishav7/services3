
/**
 * CurrencyConvertServicesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package au.edu.unsw.sltf.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Random;

import au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument.CurrenyConvertMarketData;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultDocument.CurrenyConvertMarketDataFault;
import au.edu.unsw.sltf.services.CurrenyConvertMarketDataResponseDocument.CurrenyConvertMarketDataResponse;
import au.edu.unsw.sltf.services.helper.CurrencyConverter;
import au.edu.unsw.sltf.services.helper.InvalidCurrencyException;
import au.edu.unsw.sltf.services.helper.MarketData;
    /**
     *  CurrencyConvertServicesSkeleton java skeleton for the axisService
     */
    public class CurrencyConvertServicesSkeleton implements CurrencyConvertServicesSkeletonInterface{
    	
        private String resourcesFolder = System.getProperty("catalina.base") + "/webapps/SoapServices/cs9322ass1/";

        /**
         * Auto generated method signature
         * 
         * @param currencyConvertMarketData0 
         * @return currencyConvertMarketDataResponse1 
         * @throws CurrencyConvertMarketDataFaultException 
         */
        
        public au.edu.unsw.sltf.services.CurrenyConvertMarketDataResponseDocument currenyConvertMarketData
        (
        au.edu.unsw.sltf.services.CurrenyConvertMarketDataDocument currenyConvertMarketData0
        )
  throws CurrenyConvertMarketDataFaultException{
      	 CurrenyConvertMarketData ccmd = currenyConvertMarketData0.getCurrenyConvertMarketData();
      	 MarketData marketData;
			try {
				marketData = new MarketData(ccmd.getEventSetId());
				
				if(marketData.getCurrencyCode().equals(ccmd.getTargetCurrency())){
	          		throw ccFaultException("PriceAlreadyConverted");
	          	}
				
	          	 List<MarketData> m = marketData.getMd();
	          	 CurrenyConvertMarketDataResponseDocument ccmdRespDoc = CurrenyConvertMarketDataResponseDocument.Factory.newInstance();
	          	 CurrenyConvertMarketDataResponse ccmdResp = ccmdRespDoc.addNewCurrenyConvertMarketDataResponse();
	          	 
	          	 CurrencyConverter c = new CurrencyConverter();
	          	 c.convertPrices(ccmd.getTargetCurrency(),m);
	      	 
	          	 Random rand = new Random();
	          	 int  fileName = rand.nextInt(1000000) + 1;
	           
	           File outputFile = new File(resourcesFolder + "/" + fileName + ".csv");
	           while (outputFile.exists()) {
	          	 fileName = rand.nextInt(1000000) + 1;
	               outputFile = new File(resourcesFolder + "/" + fileName + ".csv");
	           }
	           try {
	          	 FileWriter fw = new FileWriter(resourcesFolder + "/" + fileName + ".csv");
	          	 fw.write("#RIC,Date[G],Time[G],GMT Offset,Type,Price,Volume,Bid Price,Bid Size,Ask Price,Ask Size\n");
	          		for (int i = 0; i < m.size(); i++) {
	          			fw.write(m.get(i).getSec() + "," +
	          					m.get(i).getDate() + "," +
	          					m.get(i).getTime() + "," +
	          					m.get(i).getGmtOffset() + "," +
	          					m.get(i).getType() + "," +
	          					(c.getConvertedPriceValue().get(i) != "" ? ccmd.getTargetCurrency():"") +
	          					c.getConvertedPriceValue().get(i) + "," +
	          					m.get(i).getVolume() + "," +
	          					(c.getConvertedBidPriceValue().get(i) != "" ? ccmd.getTargetCurrency():"") +
	          					c.getConvertedBidPriceValue().get(i) + "," +
	          					m.get(i).getBidSize() + "," +
	          					(c.getConvertedAskPriceValue().get(i) != "" ? ccmd.getTargetCurrency():"") +
	          					c.getConvertedAskPriceValue().get(i) + "," +
	          					m.get(i).getAskSize() + "\n");
	          		}
	          	 
	          		fw.close();
	           } catch (IOException e) {
	               e.printStackTrace();
	               ccFaultException("ProgramError");
	           }
	           
	           ccmdResp.setEventSetId(Integer.toString(fileName));
	           ccmdRespDoc.setCurrenyConvertMarketDataResponse(ccmdResp);
	           return ccmdRespDoc;
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
				throw ccFaultException("InvalidEventSetId");
			} catch (InvalidCurrencyException e1) {
				e1.printStackTrace();
				throw ccFaultException("InvalidTargetCurrency");
			} catch (ParseException e1) {
				throw ccFaultException("InvalidEventSetId");
			}
        }
                 
	     private CurrenyConvertMarketDataFaultException ccFaultException(String type) {
	         CurrenyConvertMarketDataFaultType.Enum faultType = 
	        		 au.edu.unsw.sltf.services.CurrenyConvertMarketDataFaultType.Enum.
	        		 forString(type);
	         CurrenyConvertMarketDataFault fault = CurrenyConvertMarketDataFault.
	        		 Factory.newInstance();
	         fault.setInvalidMarketData(faultType);
	         CurrenyConvertMarketDataFaultDocument faultDoc = CurrenyConvertMarketDataFaultDocument.
	        		 Factory.newInstance();
	         faultDoc.setCurrenyConvertMarketDataFault(fault);
	         CurrenyConvertMarketDataFaultException ie = new CurrenyConvertMarketDataFaultException();
	         ie.setFaultMessage(faultDoc);
	         
	         return ie;
		}

    }
    