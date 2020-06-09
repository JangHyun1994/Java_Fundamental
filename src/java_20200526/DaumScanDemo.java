package java_20200526;

import java.io.FileWriter;

public class DaumScanDemo {
	
	public static void main(String[] args) {
					throws IOException {
			URL url = new URL("https://www.daum.net/");
			InputStream in = url.openStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = null;
			
			FileWriter fw = new FileWriter("c:\\dev\\daum.html");
			
			while((readLine = br.readLine()) != null) {
				System.out.println(reaLine);
				fw.write(readLine);
			}
			
			
			
	}
	
	
}
