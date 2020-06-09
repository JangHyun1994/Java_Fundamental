package java_20200519;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	//디폴트 생성자(default constructor)*********************************
	//alt + shift + s => 'C'
	public Admin () {
		super(); //부모 클래스의 디폴트 생성자를 호출.
	}
	
	//생성자(Constructor)
	//생성자는 '반환값'이 없고, 이름은 '클래스' 이름과 동일.
	//생성자의 역할은 인스턴스 변수 초기화
	//alt + shift + s => 'O'
	public Admin(String id, String pwd, String email, int level) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
	//생성자의 오버 로딩 가능하다.
	public Admin(String id, String pwd, String email) {
		//super(); //모든 생성자에는 super가 있다.
//		this.id = id;
//		this.pwd = pwd;
//		this.email = email;
		this(id, pwd, email, 0); //this는 다른 생성자를 호출할 때 사용, 반드시 생성자에서만 호출 가능. 
		//this 용법 2가지 : 1. 자기 자신 객체 => this.  2. 다른 생성자를 호출 => this(~,~,,,,)
	}

	//id에 대한 setter 메서드.
	public void setId(String id) {
		this.id = id;
	}
	
	//id에 대한 getter 메서드.
	public String getId() {
		return id;
	}
	
	//pwd에 대한 setter 메서드
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	//pwd에 대한 getter 메서드
	public String getPwd() {
		return pwd;
	}
	
	//email에 대한 setter 메서드
	public void setEmail(String email) {
		this.email = email;
	}
	
	//email에 대한 getter 메서드
	public String getEmail() {
		return email;
	}
	
	//level에 대한 setter 메서드
	public void setLevel(int level) {
		this.level = level;
	}
	
	//level에 대한 getter 메서드
	public int getLevel() {
		return level;
	}
	
	
	
	
	
	
}
