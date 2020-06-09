package java_20200521;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc"); //String클래스는 두 객체 안에 있는 내용이 같으면 오버라이딩.
		
		System.out.println(s1==s2); //false // 문자열은 반드시 equals 사용해야 한다. 
		System.out.println(s1.equals(s2)); //true // hash code값도 같게끔 오버라이딩 해야 한다. 
		
		Customer c1 = new Customer("성영한", "제주도");
		Customer c2 = new Customer("성영한", "제주도"); // c1와 c2가 같냐?
		
		System.out.println(c1 == c2); //'=='는 변경할 수 없어.
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1);
		System.out.println(s1); // 
		
		
	}
	
}
