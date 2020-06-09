package java_20200525;

public class ExceptionSampleDemo {
	public static void main(String[] args) {
	String msg = null;
	//String msg = null; //사용자로부터 어떤 입력을 받을까?에 대한 생각. 고민 . 고려. 프로그래밍. 
	//NullPointerException 예외 발생.
//	int msgLength = msg.length();
	//System.out.println();
//	
//	int[] array = {1,2,3};
//	//ArrayIndexOutOfBoundsException 예외 발생.
//	int temp = array[3]; -> index.3은 없잖아~
	
//	//ArithmeticException 예외 발생.
//	int result = 3/0; -> ㄴㄴ. 부정 or 불능.
	//이걸 사용자가 넣을까? 들어올 수 있다면 예외처리 안 함. 가능성이 있는 것들에 대해선 다 파악해야 함. 
//	System.out.println(result);
	
	//NumberFormatException 예외 발생.
//	int first = Integer.parseInt("a");  => 해석 : 'a'라는 매개변수는 paresInt라는 메소드를 만나면서, 'int'를 보아하니, 숫자로 바꿔라 이 말 아니냐.
//	System.out.println(first);
	
	//* 예외 메시지를 뿌리면서, 이 프로그램이 중단되지 않도록, 관리 관리 해야한다고.//
	
	// RuntimeException의 '하위' 클래스 : '위에서 한 것들' - NullPointer, ArrayIndexOutOfBounds, Arithmetic, NumberFormat
	
	// RuntimeException 만 신경 씁시다.
	
	
			
			
	}
}
