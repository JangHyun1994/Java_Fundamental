package java_20200521;
import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		/*
		 자바 1.4 이전 버전에서는 primitive data type을 Collection에 저장할 수 없었기 때문에, primitive data type를 객체화 할 수 있는
		 wrapper class가 필요함. 아래와 같이 1을 추가할 수 없음.
		 Collection에 1을 저장하기 위해서는 primitive data type을 객체화하는 Integer 클래스로 변환해야 함.
		 * 
		 * 
		 */
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(new Integer(1)); //객체화! wrapper class가 나온 이유!
		
		//1. primitive data type => wrapper class( new Integer(1) )
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		//2. wrapper class => primitive data type( xxxValue() )
		
		int i3 = i1.intValue() + i2.intValue();
		
		//3. String문자열을 => primitive data type  *******************************************************
		
		String s1 = "10";
		String s2 = "20";
		
		int i4 = Double.parseDouble(s1) + Double.parseDouble(s2); //문자열 끼리 더함. '+' 연결 연산자. 스트링 끼리 더하니까 스트링.
		//parseInt : 문자열을 primitive로 바꿔주는 것.
		
		System.out.println(i4);
		
		//4. primitive data type을 => String문자열로 바꿀 때도 있다.
		
		String s3 = 10+"";
		String s4 = String.valueOf(10);
		
		//primitive date type이 자동으로 wrapper class로 변환하는 것을 'auto boxing'이라고 한다.
		Integer i5 = 10;
		Integer i6 = 20;
		
		//wrapper class가 자동으로 primitive data type 변환하는 것을 'auto un-boxing'이라고 한다.
		int i7 = i5 + i6;
		
		
		System.out.println(i7);
		
		//**** wrapper가 primitive = 박싱 , primitive가 wrapper = 언박싱
		
		
		
		
	}
}
