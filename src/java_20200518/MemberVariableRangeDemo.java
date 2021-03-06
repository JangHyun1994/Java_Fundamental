package java_20200518;

public class MemberVariableRangeDemo {
	String name;
	int age;
	double weight;
	boolean isReleased;
	
	public void methodA(String id) {//id는 매개변수
		//지역변수에는 접근 한정자를 붙일 수 없다.
		//public int test;
		
		//지역변수는 (값을) 초기화를 하지 않아도 상관 없지만, 다른 곳에서 연산하면 에러 발생한다. 
		//int a;  int b = a+10 ; //에러 발생함!!!
		int a = 10;
		int b = a+10; //a는 값이 없는 상태. 그런 상태에서 연산하면 에러 발생.
		
		//id, a, b의 유효범위는 methodA에서만 사용 가능. 
	}
	
	public static void main(String[] args) {
		MemberVariableRangeDemo m = new MemberVariableRangeDemo();
		//멤버변수는 객체를 생성하면 기본값을 갖는다.
		
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.weight);
		System.out.println(m.isReleased);
	}
}
