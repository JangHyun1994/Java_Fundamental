package java_20200522;

public class StringMethodDemo {
	public static void main(String[] args) {
		String ssn = "111111-1111111";
		//charAt(int index) : 문자열 중에서 특정 index 에 있는 문자를 반환한다. (java6 피피티 16페이지*)
		char c = ssn.charAt(6);
		System.out.println(c);
		
		//String concat(String str) : 앞 문자열에, 새 문자열을 추가 연결한다.
		ssn = ssn.concat("abcd");
		System.out.println(ssn);
		
		//endsWith(String msg) : msg문자열로 끝나면 True, or flase.
		String fileName = "abcd.doc";
		if(fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		} else if (fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		} else {
			System.out.println("파일 입니다.");
		}
		
		
		//startsWith(String msg) : msg 문자열로 시작하면 true, or false.
		String url = "http://www.naver.com";
		String path = "/news/sss.do?id=123";
		if(path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다."); 
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		//문자열. 특정 부분을 가져오거나, 조건으로 다른 행위를 하거나.  능수능란하게 숙지~
		
		//equalsIgnoreCase(String msg) : 대소문자를 구분하지 않고, 문자열을 비교함. 
		boolean success = fileName.equalsIgnoreCase("abcd.DOC"); // DOC, doc 모두 허용.
			System.out.println(success);
		
		//indexOf(String msg) : msg 문자열의 위치를 반환.
		int index = ssn.indexOf("-"); //111111-1111118 : [6]
		System.out.println(index);
		
		//lastIndexOf(String msg) : msg 문자열의 위치를 마지막에서 시작하여, (index 셀 때는 다시 앞에서부터) 찾는다.
		// index는 처음부터 msg문자열까지의 index를 (세는 것이다) 반환.
		fileName = "abc.abc.abc.abc.doc";
		System.out.println(fileName.indexOf(".")); //차이 인지! 값 : 3
		System.out.println(fileName.lastIndexOf(".")); // 차이 인지! 값 : 15
		
		
		// 배열의 길이 : length, 문자열의 길이 : length() => 이걸 기억하자.
		// trim() : 앞뒤 문자열의 공백 제거.
		
		String dbId = "syh1011".trim();
		String userId = "syh1011 ".trim();
		System.out.println(dbId.equals(userId));  //컴퓨터는 오타를 허용하지 않아. 각박해...? ;;; 사용자의 잘못.
		
		
		//substring(int fist, int last)
		// first는 from부터(포함) ~ last까지(last는 포함ㄴㄴ) 그래서 '사이의' 문자열 추출.
		// substring(int first)
		// first from부터(포함) ~ 모든 문자열 다 추출.
		fileName = "abc.abc.abc.doc";
		String first = fileName.substring(0,fileName.lastIndexOf("."));
		String last = fileName.substring(fileName.lastIndexOf(".")+1); //from만 지정하면, 끝까지 다 가져온다. 
		System.out.println(first);
		System.out.println(last);
		
		//replaceAll(String first, String second)
		//first 문자열을 second 문자열로 대체.
		String html = "안녕하세요.\n저는 성영한 이에요.\n잘 부탁드려요.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);
		
		//toUpperCase() : 대문자로 변환.
		String m1 = "hello";
		m1 = m1.toUpperCase();
		
		System.out.println(m1);
		
		//toLowerCase() : 소문자로 변환.
		m1 = m1.toLowerCase();
		System.out.println(m1);
		
		//String.valueOf(~~)  :  primitive date type을 문자열로 변환해주는 메서드('함수').
		//char[] c1 = {'a', 'b', 'c'};
		String msg = String.valueOf(true); //"true"
		System.out.println(msg);
		
		
		String[] str = ssn.split("-");
		
		//String ssn = "111111-1111111";
		
		String ssn1 = str[0];
		String ssn2 = str[1];
		System.out.println(ssn1);
		System.out.println(ssn2);
		
		
		String str2 = String.format("%,.2f", 123123.4567);
		System.out.println(str2);
		
		str2 = String.format("%3$,20.2f %2$,20.2f %1$,20.2f", 1234.45, 123345.56, 34234.5690);
		
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
