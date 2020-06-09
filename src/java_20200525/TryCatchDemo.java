package java_20200525;

public class TryCatchDemo {

	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum / 2;
		return avg;
		
	}
	
	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);
			
			double average = getAvg(korean, english);
			System.out.printf("평균 : %f", average);
			
		}catch(ArrayIndexOutOfBoundsException e) {
				//System.out.println("예외 메세지 : "+e.getMessage());   // Run Configuration에서 값을 하나만 넣으면, '예외 메세지 : 1' 뜬다.
				//System.err.println("값에 2개를 넣어!");   //일반 출력은 system.out, 에러 출력은 system.err
				e.printStackTrace();
			
	
		}catch(NumberFormatException e) {
			//System.err.println("예외 메세지 : "+e.getMessage());
			System.err.println("문자 말고 숫자 넣어!");				
		}finally {
			System.out.println("finally");
		}
	
		//catch 블럭이 여러 개 있을 경우 : 위에서부터 하위 클래스부터 ~ 상위 클래스 순서로 정합니다. 제일 아래는 최상위 클래스가 위치함.
		
		
	
	
	
	}
	
}
