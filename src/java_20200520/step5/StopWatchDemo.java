package java_20200520.step5;
import java.io.BufferedReader;
import java.io.FileReader;


public class StopWatchDemo {
	
	public static void run(StopMilliWatch s1) {
		s1.execute();
	}
	
	
	
	public static void main(String[] args) throws Exception {
		//StopNanoWatch s1 = new StopNanoWatch();
		//StopMilliWatch s1 = new StopMilliWtach();
		//run(s1);
		
		//Java 입출력 19-22 line.
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\dev\\eclipse-workspace\\Java_Fundamental\\src\\java_20200520\\step5\\class.txt"));
	
		String readLine = br.readLine();
		
		//Java Reflection 24-25 line.
		Class clazz = Class.forName(readLine);
		StopWatch s = (StopWatch)clazz.newInstance();
		run(s);
		
		
	}
}










