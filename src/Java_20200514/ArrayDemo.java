package Java_20200514;

public class ArrayDemo {
	//main 컨트롤+스페이스+엔터!!!!
	public static void main(String[] args) {
		//1. 배열 선언 및 생성
		int[] a = new int[4];
		
		//2. 배열 할당 - a의 '0'번째(인덱스)에 '1'이라는 값을 넣음. 첫번째방. 각각의 방.
		a[0] = 1; // "a[0]" 자체를 하나의 변수로 생각하면 편해.
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		//3. 배열 출력
		//a.length : 배열의 길이
		for(int i=0 ; i<a.length; i++) {
			System.out.println(a[i]);	
		}
		
		//배열 선언, 생성, 할당이 '동시에' 이루어짐. 딱 봐도 이게 더 편함.
		int[] b = {100, 200, 300, 400, 500};
		//배열의 값 변경(할당)
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;
		
		//배열 출력 => for loop  :  index를 표시하면서 출력할 수 있다.
		for(int i=0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		//배열 출력 => enhanced for loop  :  
		for(int value : b) {
			System.out.println(value);
		}
		
		int[] c = a; //a변수와 c변수가 같은 객체를 바라보도록... 레퍼런스일 떄만 가능하다. 참조 가능하다고. 
		c[0] = 11;
		
		
//		int a1 = 10;
//		int b1 = a1; 변수에 변수를 집어 넣어도 참조 못 해.....
//		a1 = 20; b1은???? primitive이니까, 참조 못 하니까 그대로 10이다!!!!

	
		
			
	
		
		
		
		
		
		
		
		
				
		
		
		
	}

}
