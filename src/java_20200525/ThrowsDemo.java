package java_20200525;

public class ThrowsDemo {
	public static double getDivide(int first, int second) 
			throws ArithmeticException {
		
		int result = first / second; // 예외가 발생하는 코드.
		return result;
		
	}
	
	
	public static void main(String[] args) {
		try {
			
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[0]);
			
			int result = getDivide(first, second);
			System.out.printf("결과 : %d %n", result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인자를 2개 입력하셔야 합니다.");
		}catch(NumberFormatException e) {
			System.out.println("인자에는 숫자를 넣어야 합니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("finally");
		}
		
	}
}
