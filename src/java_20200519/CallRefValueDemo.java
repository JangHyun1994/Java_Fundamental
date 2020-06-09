package java_20200519;

public class CallRefValueDemo {
	public static void change(int i, int[] j) {
		i = 20;
		j[3] = 4000;
	}
	
	public static void main(String[] args) {
		int i = 10;
		int[] j = {1,2,3,4};
		
		System.out.println(i + "," + j[3]);
		
//		int l = i;
//		l = 20;
//		
//		int[] k = j;
//		k[3]= 4000;
		
		change(i,j); //i => call by value, j => call by reference
		
		
		System.out.println(i + "," + j[3]);
		
		int a = 10;
		double b = 10.0;
		// primitive == primitive  ~> 값비교
		System.out.println(a==b);
		
		int[] a1 = {1,2,3,4}
		int[] b1 = {1,2,3,4}
		int[] c1 = b1;  //의미 : "b1이 참조하는 객체를 c1도 참조하라."
		// ref == ref ~> 두 ref가 같은 객체를 참조하는 지를 판단한다. 
		// 같은 객체를 참조하면, True. 같은 객체를 참조하지 않으면 False.
		
		System.out.println(a1==b1);
		System.out.println(c1==b1); // 두 레퍼런스가 같은 객체를 참조하는지를 물어보는 것.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
