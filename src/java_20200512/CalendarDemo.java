package java_20200512;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력 만들기
		 * 1. 1년 1월 1일 월요일
		 * 2. 1년 365일 이고, 윤년일 때는 366일(2월 29일)
		 * 3. 윤년은 4년 마다 발생하고, 그 중에 100의 배수는 제외하고, 400배수는 제외하지 않는다.
		 * 4. 2020년 5월 12일은 무슨 요일일까?
		 * 5. 2019년까지 총 일수 + 4일 까지 총 일수 + 12 더해서 7로 나눈 나머지가 1이면 월요일. 2이면 화요일. (......)
		 * 
		 */
		
		int year = 2020;
		int month = 5;
		int day = 12;
		int totalCount = 0;
		int rest = 0;
		String message = null;
		if(rest == 1) {
			message = "월요일";
		}
		
		
		
		int preYear = year-1;
		//2019년 총일 수
		totalCount = preYear * 365 + (preYear/4 - preYear/100 - preYear/400);
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//monthArray 배열에서 year이 윤년인지 아닌지를 판단하여, 윤년이면 monthArray의 두 번째 방의 값을 29로 변경해야 한다.
		
		
		for (int i = 0; i < month-1; i++) {
			totalCount += monthArray[i];
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(year+"년 "+month+"월 "+day+" 일은"+message+" 입니다.");
		
		
	}

}
