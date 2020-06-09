package java_20200520.step1;
	//요구사항 : "밀리 세컨드로 경과시간을 알려주는 App을 만들어주세요."
​
public class FootStopWatch {
	long startTime;
	long endTime;
	
	public double getElapsedTime() {
		return (double)(endTime - startTime) / 1000;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FootStopWatch f1 = new FootStopWatch();
		
		//1970년 1월 1일 부터 지금까지의 시간을 밀리 세컨드로 반환.
		f1.startTime = System.currentTimeMillis();
		
		for(long i=0; i<7000_000_000l; i++) {
			
		}
		
		f1.endTime = System.currentTimeMillis();
		
		double elapsedTime = (double)(f1.endTime - f1.startTime) / 1000;
				
		System.out.printf("경과 시간 : %.3f", elapsedTime);
	
	}
}
