package java_20200520.step3;

public class StopMilliWatch {
	//밀리 세컨드를 관리하기 위한 변수
	private long startTime;
	private long endTime;
	
	//밀리 세컨드의 경과 시간
	public double getElapsdTime() {
		//return (double)(endTime - startTime) / 1_000_000_000;
		
		//밀리 세컨드의 시작 시간
		private void start() {
			startTime = System.nanoTime();
		}
		//밀리 세컨드의 종료 시간
		private void stop() {
			endTime = System.nanoTime();	
		}
	}
