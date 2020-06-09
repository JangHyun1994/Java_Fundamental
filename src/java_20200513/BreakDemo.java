package java_20200513;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i==6) break;
			sum += i;
		}
		System.out.printf("1부터 5까지 합은 %d 입니다. %n", sum);
		
		//label명-label이 있는 해당 블록을 빠져나갈 수 있다.
		outter:for (int i = 2; i <= 9; i++) {
			for(int j=1 ; j<=9; j++) {
				if(i==5 && j==6) break outter; //label명-label이 있는 해당 블록을 빠져나갈 수 있다.
				System.out.printf("%d * %d = %d %n", i,j,i*j);
			}
		}
	}

}
