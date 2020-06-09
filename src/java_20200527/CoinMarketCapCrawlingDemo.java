package java_20200527;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketCapCrawlingDemo {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("c:\\dev\\coin.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String url = "https://coinmarketcap.com/currencies/"
				+ "bitcoin/historical-data/"
				+ "?start=20200520&end=20200527";
		
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements trElements = doc.select(
				".cmc-table__table-wrapper-outer table tbody tr");
		
		System.out.println("날짜\t시가\t고가\t저가\t종가\t거래량\t총량");
		
		
		/*
		for(int i=0;i<trElements.size();i++) {
			Element trElement = trElements.get(i);
			
			Elements tdElements = trElement.select("td");
			for(int j=0;j<tdElements.size();j++) {
				Element tdElement = tdElements.get(j);
				System.out.print(tdElement.text()+"\t");
			}
			System.out.println();
		}
		*/
		
		
		for(int i=0; i<trElements.size();i++) {
			Element trElement = trElements.get(i);
			String date = trElement.child(0).text();
			String open = trElement.child(1).text();
			String high = trElement.child(2).text();
			String low = trElement.child(3).text();
			String close = trElement.child(4).text();
			String volume = trElement.child(5).text();
			String marketCap = trElement.child(6).text();
			System.out.println(date+"\t"+open+"\t"+high+"\t"+low+"\t"+close+"\t"+volume+"\t"+marketCap);
			
			fw.write(date+"\t"+open+"\t"+high+"\t"+low+"\t"+close+"\t"+volume+"\t"+marketCap);
			
			
					
			
			
			
			
		}
		
	}
}
