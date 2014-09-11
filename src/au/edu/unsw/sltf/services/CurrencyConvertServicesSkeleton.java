
/**
 * CurrencyConvertServicesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package au.edu.unsw.sltf.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.io.FileUtils;

import com.google.common.collect.ImmutableMap;

import au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData;
import au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse;
import au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse;
import au.edu.unsw.sltf.services.helper.MarketData;
    /**
     *  CurrencyConvertServicesSkeleton java skeleton for the axisService
     */
    public class CurrencyConvertServicesSkeleton implements CurrencyConvertServicesSkeletonInterface{
    	private static final Map<String, Double> currencyMap = ImmutableMap.<String, Double>builder()
    		    .put("USD", 0.9307674541)
    		    .put("EUR", 0.7006667524)
    		    .put("GBP", 0.5595633550)
    		    .put("INR", 56.3764094347)
    		    .put("AUD", 1.0000000000)
    		    .put("CAD", 1.0186495032)
    		    .put("AED", 3.4187553290)
    		    .put("MYR", 2.9504323013)
    		    .build();
    	
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
                	 
                	 CurrencyConvertMarketDataResponseDocument ccmdRespDoc = CurrencyConvertMarketDataResponseDocument.Factory.newInstance();
                	 CurrencyConvertMarketDataResponse ccmdResp = ccmdRespDoc.addNewCurrencyConvertMarketDataResponse();
                	 String priceValue;
                	 String fullPrice;
                	 String fullBidPrice;
                	 String fullAskPrice;
                	 String askPriceValue;
                	 String bidPriceValue;
                	 List<Double> convertedPriceValue = new ArrayList<Double>();
                	 List<Double> convertedAskPriceValue = new ArrayList<Double>();
                	 List<Double> convertedBidPriceValue = new ArrayList<Double>();
                	 for (int i = 0 ; i < 5 ; i++){
                		 
                		 List<MarketData> m = marketData.md;
                		 fullPrice = m.get(i).getPrice();
                		 priceValue = fullPrice.substring(3, fullPrice.length());
                		 convertedPriceValue.add(currencyMap.get(ccmd.getTargetCurrency()) * Double.parseDouble(priceValue));
                		 
                		 fullBidPrice = m.get(i).getBidPrice();
                		 bidPriceValue = fullBidPrice.substring(3, fullBidPrice.length());
                		 convertedBidPriceValue.add(currencyMap.get(ccmd.getTargetCurrency()) * Double.parseDouble(bidPriceValue));
                		 
                		 fullAskPrice = m.get(i).getAskPrice();
                		 askPriceValue = fullAskPrice.substring(3, fullAskPrice.length());
                		 convertedAskPriceValue.add(currencyMap.get(ccmd.getTargetCurrency()) * Double.parseDouble(askPriceValue));
                	 }
                	 
                	 
                	 
                	 File directory = new File(resourcesFolder);
                     
                     Random rand = new Random();
                     int  fileName = rand.nextInt(1000000) + 1;
                     
                     File outputFile = new File(resourcesFolder + "/" + fileName);
                     while (outputFile.exists()) {
                    	 fileName = rand.nextInt(1000000) + 1;
                         outputFile = new File(resourcesFolder + "/" + fileName);
                     }
                     try {
                         FileUtils.writeStringToFile(outputFile, csvString);
                     } catch (IOException e) {
                         // TODO Auto-generated catch block
                         e.printStackTrace();
                     }
                     
                     
                     ccmdResp.setEventSetId(Integer.toString(fileName));
                     ccmdRespDoc.setCurrencyConvertMarketDataResponse(ccmdResp);
                     return ccmdRespDoc;
                	 
        }
     
    }
    