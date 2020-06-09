package java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin(); // 생성자가 필요하다.
//		a.id = "syh1011";
		// id가 private이기 때문에 접근 불가.
//		a.setId("syh1011");
//		a.setPwd("1111");
//		a.setEmail("syh@hbilab.org");
//		a.setLevel(1);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());

		Admin a1 = new Admin("syh2022", "2222", "test@test.com")
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
	}
}





