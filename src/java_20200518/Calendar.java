package java_20200518;

public class Calendar {
	private int year;
	private int month;
	private int day;
	
	public Calendar(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	//year에 대한 setter 메서드.
	//setter 메서드를 이용하여 year을 변경한다.
	public void setYear(int y) {
		this.year = year;
	}
	
	//year에 대한 getter 메서드.
	//getter 메서드를 이용하여 year를 가져온다.
	public int getYear() {
		return year;	
	}
	// "this."  :  자기 자신 객체   vs "this()"
	//로컬 변수와 멤버 변수를 구분할 때 사용한다. 예) this.year = year;
	public void set(int year, int month, int day) {
		this.year = y;
		this.month = m;
		this.day = d;
	}
	
	private int getCount() {
		int totalCount = 0;
		
		int preYear = year-1;
		//2019
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}