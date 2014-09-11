package au.edu.unsw.sltf.services.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class CurrencyConverter {
	
	private List<Double> convertedPriceValue = new ArrayList<Double>();
	private List<Double> convertedAskPriceValue = new ArrayList<Double>();
   	private List<Double> convertedBidPriceValue = new ArrayList<Double>();
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
	
 	public List<Double> getConvertedPriceValue() {
		return convertedPriceValue;
	}


	public void setConvertedPriceValue(List<Double> convertedPriceValue) {
		this.convertedPriceValue = convertedPriceValue;
	}


	public List<Double> getConvertedAskPriceValue() {
		return convertedAskPriceValue;
	}


	public void setConvertedAskPriceValue(List<Double> convertedAskPriceValue) {
		this.convertedAskPriceValue = convertedAskPriceValue;
	}


	public List<Double> getConvertedBidPriceValue() {
		return convertedBidPriceValue;
	}


	public void setConvertedBidPriceValue(List<Double> convertedBidPriceValue) {
		this.convertedBidPriceValue = convertedBidPriceValue;
	}
	
	public void convertPrices(String targetCurrency, List<MarketData> m){
		String priceValue;
   	 String fullPrice;
   	 String fullBidPrice;
   	 String fullAskPrice;
   	 String askPriceValue;
   	 String bidPriceValue;
   	
   	 for (int i = 0 ; i < m.size() ; i++){
   		 
   		 fullPrice = m.get(i).getPrice();
   		 priceValue = fullPrice.substring(3, fullPrice.length());
   		 convertedPriceValue.add(currencyMap.get(targetCurrency) * Double.parseDouble(priceValue));
   		 
   		 fullBidPrice = m.get(i).getBidPrice();
   		 bidPriceValue = fullBidPrice.substring(3, fullBidPrice.length());
   		 convertedBidPriceValue.add(currencyMap.get(targetCurrency) * Double.parseDouble(bidPriceValue));
   		 
   		 fullAskPrice = m.get(i).getAskPrice();
   		 askPriceValue = fullAskPrice.substring(3, fullAskPrice.length());
   		 convertedAskPriceValue.add(currencyMap.get(targetCurrency) * Double.parseDouble(askPriceValue));
   	 }
	}

}
