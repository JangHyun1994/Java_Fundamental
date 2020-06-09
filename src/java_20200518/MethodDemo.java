package java_20200518;

public class MethodDemo {
	//8~16 line 까지 메서드를 정의
	//boolean 메서드의 반환값
	//instance 메서드.
	//int year => 매개변수(parameter)
	public boolean isLeafYear(int year) {
//		boolean isLeaf = year%4 == 0 && year%100 != 0; || year%400 == 0;
//		return isLeaf ;
		
		return year%4 == 0 && year%100 != 0; || year%400 == 0;
		//메서드 반환값이 boolean이기 때문에, return value의 value도 boolean 이어야 한다.
		
	}
	public long plus(int firt, int second) {
		return (long)first + (long)second;  //따로 따로 long long.
	}
	public double divide(int first, int second) {
		return (double)first/(double)second;
	}
	
	}//오름차순
		public int[] ascending(int[] array) {
			for(int i = 0; i < array.length; i++) {
		        for(int j = 0 ; j < array.length -(i+1); j++) {
		            if(array[j] < array[j+1]) {
		                int temp = array[j+1];
		                array[j+1] = array[j];
		                array[j] = temp;
		            }
		        }
		    }
		return array;
		
		public static void main(String[] args) {
			MethodDemo m = new MethodDemo();
			boolean test = m.isLeafYear(2000);//Argument(아규먼트)
			if(test) {
				System.out.println("윤년입니다.");
			}else {
				System.out.println("윤년이 아닙니다.");
			}
			
			
			long result = m.plus(1000000, 12312312331) ;
			System.out.println(result);
			
			double result2 = m.divide(12, 5);
			System.out.println(result2);
			
			int[] temp = {1, 34, 9, 2, 40, 5, 45};
			
			int[] result3 = m.ascending(temp);
			
			for(int value : result3) {
				System.out.println(valut + "\t");
			}
		}
}










