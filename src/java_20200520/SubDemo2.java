package java_20200520;

public class SubDemo2 {
	public static void change(Super sup) {//Super sup = s1;
		sup.age = 20;
		sup.playBadook();
		sup.work(); //자식의 work - Sub work() 호출 : 왜? 이유 : overriding 때문에. overriding메서드는 자식 메서드가 호출됨.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s1 = new Sub();
		System.out.println(s1.age);
		
		change(s1);
		
		System.out.println(s1.age);
		
		
	}
}
