package java_20200527;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDemo {
	
	public static void main(String[] args) {
		URL url = new URL("http://corners.gmarket.co.kr/Bestsellers?ItemId=18031239812938#98291389");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String reference = url.getRef();
		
		System.out.println("protocol : "+protocol);
		System.out.println("host : "+host);
		System.out.println("port : "+port);
		System.out.println("path : "+path);
		System.out.println("query : "+query);
		System.out.println("reference : "+reference);
		System.out.println("protocol : "+protocol);
		
		InputStream in = url.openStream(); //html 정보
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			
		}
		
		in.close();
		isr.close();
		br.close();
		
		
		
		
	}
		
}
