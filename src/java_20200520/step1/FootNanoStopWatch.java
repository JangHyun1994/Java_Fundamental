package java_20200520.step1;

import java.util.concurrent.atomic.LongAdder;

// "나노 세컨드로 경과시간을 알려주는 App을 만들어주세요."
public class FootNanoStopWatch {
	long startTime;
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	
	
	public double getElapsedTime() {
		return (double)(endTime - startTime) / 1_000;
	}
	public double getElapsedTime() {
		return (double)(endNanoTime - startNanoTime) / 1_000_000_000;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootNanoStopWatch f1 = new FootNanoStopWatch();
		f1.startNanoTime = System.currentTimeMillis();
		for(long i=0; i<20000_000_000l; i++) {
			
		}
		f1.endNanoTime = System.nanoTime();
		
		double elapsedTime = f1.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}

}
