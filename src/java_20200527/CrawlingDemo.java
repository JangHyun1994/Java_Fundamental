package java_20200527;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {

	public static void main(String[] args) {
		
		/*
		String url = "http://www.imbc.com/";
		
		//HTML문서 전체를 관리하기 위한, 객체. 
		Document doc = null;
		
		try {
			//url로 연결하여 html 정보를 get 방식으로 가져온다. 
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("성공...");
		//html 정보에서 class 정보를 가져올 때는 '.'을 앞에 찍고, id 정보를 가져올 때는 '#'을 앞에 찍는다. 
		//크롬 > 검사 > 들어가서, class만 잘 찾으면 된다. 문법 지키고.
		// 화이또.
		Elements elements = doc.select(".notice-list li");
		
		for(int i=0; i<elements.size(); i++) {
			Element liElement = elements.get(i);
			System.out.println(liElement.text());
			
		}
		
		*/
		
		
		String url = "https://sports.news.naver.com/kfootball/index.nhn";
		
		Document doc = null;
		
		try {
			//url로 연결하여 html 정보를 get 방식으로 가져온다. 
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("성공...");
		
		Elements elements = doc.select(".home_news");
		
		Elements liElements = elements.select(".home_news_list li");
				
		for(int i=0; i<liElements.size(); i++) {
			Element liElement = liElements.get(i);
			System.out.println(liElement.text());
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
