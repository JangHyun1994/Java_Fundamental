package java_20200520;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s1 = new Super();
		System.out.println(s1.age);
		s1.playBadook();
		s1.work();
		
		System.out.println("==========================================");
		Sub s2 = new Sub();
		System.out.println(s2.height);
		s2.playGame();
		s2.work(); //
		
		s2.age = 20;
		System.out.println(s2.age);
		s2.playBadook();
		System.out.println("==========================================");
	
		Super s3 = new Sub(); //이렇게 왜 할까?  //***추상 클래스는 객체를 못 만든다(메모리에 못 올려)..........!!!!
		//일반 클래스일 땐, 절대 이렇게 만들지 않는다.
		//추상 클래스일 때. => 자식의 도움을 받아서, 부모를 메모리에 올린다. 
		
		//Super s3 = s2; //s2가 가리키는 객체(Sub객체)를 s3(Super)도 가리켜라. 
		System.out.println(s3.age);
		s3.playBadook();
		s3.work(); //work가 자식 것이 호출된다. 왜? 오버라이딩일 경우니까.
		
		//s3.height = 20; // 자식 걸 호출할 수 없어. 갖다 쓸 수 없어. 오직 오버라이딩 된 work 뿐.
		//s3.playGame(); //자식 걸 호출할 수 없어. 갖다 쓸 수 없어. 오직 오버라이딩 된 work 뿐.
		
		
		
	}

}
