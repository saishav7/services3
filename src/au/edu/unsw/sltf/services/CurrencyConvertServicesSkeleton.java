
/**
 * CurrencyConvertServicesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package au.edu.unsw.sltf.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData;
import au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse;
import au.edu.unsw.sltf.services.helper.CurrencyConverter;
import au.edu.unsw.sltf.services.helper.MarketData;
    /**
     *  CurrencyConvertServicesSkeleton java skeleton for the axisService
     */
    public class CurrencyConvertServicesSkeleton implements CurrencyConvertServicesSkeletonInterface{
    	
        private String resourcesFolder = System.getProperty("catalina.home") + "/webapps/ROOT/cs9322ass1/";

        /**
         * Auto generated method signature
         * 
             * @param currencyConvertMarketData0 
             * @return currencyConvertMarketDataResponse1 
             * @throws CurrencyConvertMarketDataFaultException 
         */
        
                 public au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument currencyConvertMarketData
                  (
                  au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument currencyConvertMarketData0
                  )
            throws CurrencyConvertMarketDataFaultException{
                //TODO : fill this with the necessary business logic
                	 CurrencyConvertMarketData ccmd = currencyConvertMarketData0.getCurrencyConvertMarketData();
                	 MarketData marketData = new MarketData(ccmd.getEventSetId());
                	 List<MarketData> m = marketData.getMd();
                	 CurrencyConvertMarketDataResponseDocument ccmdRespDoc = CurrencyConvertMarketDataResponseDocument.Factory.newInstance();
                	 CurrencyConvertMarketDataResponse ccmdResp = ccmdRespDoc.addNewCurrencyConvertMarketDataResponse();
                	 
                	 CurrencyConverter c = new CurrencyConverter();
                	 c.convertPrices(ccmd.getTargetCurrency(),m);
                	 
                     Random rand = new Random();
                     int  fileName = rand.nextInt(1000000) + 1;
                     
                     File outputFile = new File(resourcesFolder + "/" + fileName);
                     while (outputFile.exists()) {
                    	 fileName = rand.nextInt(1000000) + 1;
                         outputFile = new File(resourcesFolder + "/" + fileName);
                     }
                     try {
                    	 FileWriter fw = new FileWriter(resourcesFolder + "/" + fileName);
                    	 
                    		for (int i = 0; i < m.size(); i++) {
                    			fw.write(m.get(i).getSec() + "," +
                    					m.get(i).getDate() + "," +
                    					m.get(i).getTime() + "," +
                    					m.get(i).getGmtOffset() + "," +
                    					m.get(i).getType() + "," +
                    					c.getConvertedPriceValue().get(i) + "," +
                    					m.get(i).getVolume() + "," +
                    					c.getConvertedBidPriceValue().get(i) + "," +
                    					m.get(i).getBidSize() + "," +
                    					c.getConvertedAskPriceValue().get(i) + "," +
                    					m.get(i).getAskSize());
                    		}
                    	 
                    		fw.close();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                     
                     
                     ccmdResp.setEventSetId(Integer.toString(fileName));
                     ccmdRespDoc.setCurrencyConvertMarketDataResponse(ccmdResp);
                     return ccmdRespDoc;
                	 
        }
     
    }
    