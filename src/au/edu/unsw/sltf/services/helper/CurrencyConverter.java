package au.edu.unsw.sltf.services.helper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyConverter {
	
	private List<String> convertedPriceValue = new ArrayList<String>();
	private List<String> convertedAskPriceValue = new ArrayList<String>();
   	private List<String> convertedBidPriceValue = new ArrayList<String>();
	private final Map<String,Double> currencyMap = new HashMap<String,Double>(){
	{
		put("USD",0.9307674541);
		put("EUR",0.7006667524);
		put("GBP",0.5595633550);
		put("INR",56.3764094347);
		put("AUD",1.0000000000);
		put("CAD",1.0186495032);
		put("AED",3.4187553290);
		put("MYR",2.9504323013);
		put("CHF",0.8485060621);
		put("CNY",5.7169778027);
		put("THB",29.7530912155);
		put("SAR",3.4906575553);
		put("NZD",1.1074715799);
		put("JPY",96.2122312587);
		put("SGD",1.1633573960);
		put("PHP",40.8329652890);
		put("TRY",2.0247864441);
		put("HKD",7.2140630051);
		put("IDR",10904.8306722706);
		put("ZAR",9.9594464736);
		put("MXN",12.1762503367);
		put("SEK",6.4237039867);
		put("BRL",2.0978791032);
		put("HUF",220.3320163609);
		put("PKR",94.1936635125);
		put("QAR",3.3892500977);
		put("OMR",0.3583687340);
		put("KWD",0.2641518090);
		put("DKK",5.2242123886);
		put("NOK",5.7477165037);
		put("RUB",33.7327115669);
		put("EGP",6.6554991151);
		put("KRW",952.2142051678);
		put("PLN",2.9342110919);
		put("COP",1779.8042282476);
		put("CZK",19.5741059554);
		put("ILS",3.2925802265);
		put("IQD",1082.4825490957);
		put("NGN",151.0635606378);
		put("MAD",7.8216660698);
		put("ARS",7.7104779589);
		put("LKR",121.1625994479);
		put("TWD",27.9051526203);
		put("BDT",72.2927064542);
		put("BHD",0.3509226070);
		put("VND",19713.6546774267);
		put("CLP",542.8381789978);
		put("KES",82.1867690358);
		put("TND",1.6023160976);
		put("XOF",459.6072608795);
		put("JOD",0.6584714654);
		put("GHS",3.4671086777);
		put("HRK",5.3385769273);
		put("BGN",1.3704211061);
		put("RON",3.0955357462);
		put("PEN",2.6322104241);
		put("DZD",74.6063530050);
		put("NPR",90.9708609480);
		put("XAF",459.6072608795);
		put("ISK",108.3134093246);
		put("UAH",12.3121915914);
		put("FJD",1.7169741020);
		put("DOP",40.5814595777);
		put("XPF",83.6117842915);
		put("MUR",28.9840979520);
		put("AZN",0.7299075409);
		put("BAM",1.3703850543);
		put("XAU",0.0007191858);
		put("IRR",24736.0758596455);
		put("RSD",82.3361582382);
		put("LTL",2.4192621626);
		put("BND",1.1633573960);
		put("ETB",18.4682971127);
		put("CRC",504.2897952590);
		put("VEF",5.8568542226);
		put("AFN",51.7506690266);
		put("TZS",1552.0547296794);
		put("UGX",2419.9953806095);
		put("JMD",112.9000801876);
		put("GEL",1.6054650334);
		put("ZWD",336.8447416318);
		put("BWP",8.2369165711);
		put("CUC",0.9307674541);
		put("ZMW",5.6032204996);
		put("MMK",906.5675002745);
		put("GTQ",7.2813937507);
		put("XCD",2.5130721285);
		put("LYD",1.1441924519);
		put("MKD",43.0759166387);
		put("TTD",5.9094425447);
		put("MZN",28.2487925864);
		put("ALL",97.6601306602);
		put("BOB",6.4316029657);
		put("KZT",169.2647255875);
		put("BBD",1.8615349082);
		put("AOA",90.9529930210);
		put("KHR",3774.2620262968);
		put("XAG",0.0476860718);
		put("AMD",379.5100830077);
		put("UYU",22.2267277976);
		put("MOP",7.4304848952);
		put("NAD",9.9594464736);
		put("LBP",1405.9242393887);
		put("LAK",7482.9049470808);
		put("BYR",9663.6930919916);
		put("MGA",2373.4570079055);
		put("SYP",141.8024273101);
		put("VUV",87.8179078723);
		put("PGK",2.2897460393);
		put("MNT",1724.2467086843);
		put("SDG",5.2983938389);
		put("ANG",1.6505298635);
		put("MWK",368.2581375260);
		put("GMD",37.3703147016);
		put("CUP",24.6653375331);
		put("RWF",640.3680084074);
		put("MVR",14.3058965503);
		put("BTN",56.3764094347);
		put("SCR",12.0301695215);
		put("HNL",19.6019620859);
		put("KPW",121.3259628065);
		put("PYG",3967.8616567455);
		put("DJF",168.6550598389);
		put("XBT",0.0018339876);
		put("YER",200.0219202010);
		put("CDF",850.7214530297);
		put("WST",2.1436376739);
		put("GYD",191.4588624639);
		put("AWG",1.6660737428);
		put("MDL",12.8771677627);
		put("BZD",1.8590218628);
		put("HTG",41.6053059075);
		put("KGS",48.4777240548);
		put("NIO",24.3162946314);
		put("CVE",76.2298488082);
		put("KYD",0.7632294345);
		put("GNF",6582.3874352579);
		put("BSD",0.9307674541);
		put("BIF",1428.7280420137);
		put("SLL",4095.3767979546);
		put("MRO",270.6671642847);
		put("TOP",1.7188688857);
		put("BMD",0.9307674541);
		put("SBD",6.7154938967);
		put("UZS",2182.0828837899);
		put("SOS",1115.9745984372);
		put("PAB",0.9307674541);
		put("SRD",3.0482635009);
		put("XDR",0.6107230605);
		put("SZL",9.9594464736);
		put("ERN",9.7451325672);
		put("LRD",86.0959163209);
		put("TJS",4.6319513005);
		put("TMT",2.6526872441);
		put("GIP",0.5595633550);
		put("LSL",9.9594464736);
		put("KMF",344.7054456596);
		put("SVC",8.1442152232);
		put("GGP",0.5595633550);
		put("XPT",0.0006513563);
		put("STD",17177.3133650571);
		put("IMP",0.5595633550);
		put("FKP",0.5595633550);
		put("XPD",0.0010716932);
		put("JEP",0.5595633550);
		put("SHP",0.5595633550);
		put("SPL",0.1551279090);
		put("TVD",1.0000000000);
		
	}};
	


	public List<String> getConvertedPriceValue() {
		return convertedPriceValue;
	}


	public void setConvertedPriceValue(List<String> convertedPriceValue) {
		this.convertedPriceValue = convertedPriceValue;
	}


	public List<String> getConvertedAskPriceValue() {
		return convertedAskPriceValue;
	}


	public void setConvertedAskPriceValue(List<String> convertedAskPriceValue) {
		this.convertedAskPriceValue = convertedAskPriceValue;
	}


	public List<String> getConvertedBidPriceValue() {
		return convertedBidPriceValue;
	}


	public void setConvertedBidPriceValue(List<String> convertedBidPriceValue) {
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
   		 if(!(m.get(i).getPrice()).equals("")) {
   			 fullPrice = m.get(i).getPrice();
   			 priceValue = fullPrice.replaceAll("[^\\d.]", "");
   			 BigDecimal resultPrice = new BigDecimal(currencyMap.get(targetCurrency)).multiply(new BigDecimal(priceValue));
   			 convertedPriceValue.add(resultPrice.setScale(2, BigDecimal.ROUND_HALF_UP).toString());
   		 }
   		 else
   			 convertedPriceValue.add("");
   		 
   		 if(!(m.get(i).getBidPrice()).equals("")) {
   			 fullBidPrice = m.get(i).getBidPrice();
   			 bidPriceValue = fullBidPrice.replaceAll("[^\\d.]", "");
   			 BigDecimal resultBidPrice = new BigDecimal(currencyMap.get(targetCurrency)).multiply(new BigDecimal(bidPriceValue));
   			
   			 convertedBidPriceValue.add(resultBidPrice.setScale(2, BigDecimal.ROUND_HALF_UP).toString());
   		 }
   		else
  			 convertedBidPriceValue.add("");
   		 
   		 if(!(m.get(i).getAskPrice()).equals("")) {
   			 fullAskPrice = m.get(i).getAskPrice();
   			 askPriceValue = fullAskPrice.replaceAll("[^\\d.]", "");
   			 BigDecimal resultAskPrice = new BigDecimal(currencyMap.get(targetCurrency)).multiply(new BigDecimal(askPriceValue));
   			 convertedAskPriceValue.add(resultAskPrice.setScale(2, BigDecimal.ROUND_HALF_UP).toString());
   		 }
   		else
  			 convertedAskPriceValue.add("");
   	}
	}

}
