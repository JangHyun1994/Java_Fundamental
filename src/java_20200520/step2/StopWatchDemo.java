package java_20200520.step3;

import java_20200520.step3.StopNanoWatch;

public class StopWatchDemo {
	
	public static void run(StopMilliWatch s1) {
		s1.start();
		for(long i=0; i<20000_000_000l; i++) {
			
		}
		s1.stop();
		
		double elapsedTime = s1.getElapsdNanoTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
	
	public static void run(StopNanoWatch s1) {
		s1.start();
		for(long i=0; i<20000_000_000l; i++) {
			
		}
		s1.stop();
		
		double elapsedTime = s1.getElapsdNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
	
	public static void main(String[] args) {
		//StopNanoWatch s1 = new StopNanoWatch();
		StopMilliWatch s1 = new StopMilliWatch();
		run(s1);
	}
}
