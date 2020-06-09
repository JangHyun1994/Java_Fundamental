package Java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
		//로또 복권
		//1. 1부터 45까지의 숫자 중 임의 숫자 6개를 생성한다. 
		//2. 6개의 숫자 중 중복된 숫자가 나오면 안 된다.
		//Math.random() => 0보다 크거나 같고 1보다 작은 양수를,double 값으로 반환한다. 
		// 0.00000 ~ 0.999999
		
//		double random = Math.random()*45;
		// 1~45 의 임의의 랜덤값을 반환.
		
		
		int[] lotto = new int[6];
		
//		for (int i = 0; i < lotto.length; i++) {
//			int random = (int)(Math.random()*45) +1;
//			lotto[i] = random;
//		}
//		for (int value : lotto) {
//			System.out.print(value + "\t");
//			
//		}	
//		
		
		
		
		
		
		
		
		//우린 지금 뭘 할꺼냐면, '중복'을 없애고 '오름차순'으로 로또 숫자를 이쁘게 뽑을거야. 이걸 코딩으로 짜야 해.
		for (int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random()*45) + 1;
			
			//중복되는 값이 있는지 체크하는 변수
			boolean isExisted = false;
			
			//중복체크하는 코드
			for (int j = 0; j < i; j++) {
				if(lotto[j]==random) {
					isExisted = true;
					break;
				}
			}
			if(!isExisted) {
				lotto[i] = random;
			}else {
				i--;
			}
		
		}
		
		
		//역시 git은 좋아 ><!!!!
		
		//오름차순 정렬(선생님 노트패드 사진 촬영!) - "BubleSort 버블정렬 버블소트" 알고리즘!
		//내림차순은 부등호만 바꾸면 돼~~~~~~~~~~~~~~
		//bouble sort(ascending)
		for(int i = 0; i < lotto.length; i++) {
	        for(int j = 0 ; j < lotto.length -(i+1); j++) {
	            if(lotto[j] > lotto[j+1]) {
	                int temp = lotto[j+1];
	                lotto[j+1] = lotto[j];
	                lotto[j] = temp;
	            }
	        }
	    }
		
		for (int value : lotto) {
			System.out.print(value + "\t");
			
		}
//		//내림차순 : buble sort
//		for(int i = 0; i < lotto.length; i++) {
//	        for(int j = 0 ; j < lotto.length -(i+1); j++) {
//	            if(lotto[j] < lotto[j+1]) {
//	                int temp = lotto[j+1];
//	                lotto[j+1] = lotto[j];
//	                lotto[j] = temp;
//	            }
//	        }
//	    }
//		
//		for (int value : lotto) {
//			System.out.print(value + "\t");
//			
//		}
	}

}
