package au.edu.unsw.sltf.services.helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MarketData {
	private int index;
	private String sec;
	private String Date;
	private String Time;
	private String GmtOffset;
	private String type;
	private String price;
	private String volume;
	private String bidPrice;
	private String bidSize;
	private String askPrice;
	private String askSize;
	private List<MarketData> md = new ArrayList<MarketData>();

	
	public MarketData(String eventSetId) {
		try {
			readCSV(eventSetId);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private MarketData() {
		
	}
	
	
	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getGmtOffset() {
		return GmtOffset;
	}

	public void setGmtOffset(String gmtOffset) {
		GmtOffset = gmtOffset;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(String bidPrice) {
		this.bidPrice = bidPrice;
	}

	public String getBidSize() {
		return bidSize;
	}

	public void setBidSize(String bidSize) {
		this.bidSize = bidSize;
	}

	public String getAskPrice() {
		return askPrice;
	}

	public void setAskPrice(String askPrice) {
		this.askPrice = askPrice;
	}

	public String getAskSize() {
		return askSize;
	}

	public void setAskSize(String askSize) {
		this.askSize = askSize;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public List<MarketData> getMd() {
		return md;
	}


	private void readCSV(String eventSetId) throws FileNotFoundException {
		//Get a scanner instance
        Scanner scanner = new Scanner(new File(eventSetId));
         
        //Setting the delimiter used in file
        scanner.useDelimiter(",");
        
        int i = 0;
        
        while (scanner.hasNext()) 
        {
        	md.set(i, new MarketData());
        	md.get(i).setSec(scanner.next());
        	md.get(i).setDate(scanner.next());
        	md.get(i).setTime(scanner.next());
        	md.get(i).setGmtOffset(scanner.next());
        	md.get(i).setType(scanner.next());
        	md.get(i).setPrice(scanner.next());
        	md.get(i).setVolume(scanner.next());
        	md.get(i).setBidPrice(scanner.next());
        	md.get(i).setBidSize(scanner.next());
        	md.get(i).setAskPrice(scanner.next());
        	md.get(i).setAskSize(scanner.next());
        	i++;
        }
         
        //Do not forget to close the scanner  
        scanner.close();
	}

}
