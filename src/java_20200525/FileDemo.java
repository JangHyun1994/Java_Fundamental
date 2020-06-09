package java_20200525;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static void main(String[] args) {
		//File 클래스
		//1. 디렉토리 생성
		//2. *파일 크기, 파일 이름, 파일 경로, 파일 날짜,
		//3. 파일 생성, 삭제
		//4. 파일 이름 변경.
		
		
		File f1 = new File("C:\\dev\\2020\\05\\25");
		boolean success = f1.mkdirs();
		if(success) {
			System.out.println("디렉토리를 생성했습니다.");
		}else {
			System.out.println("이미 디렉토리가 있습니다.");			
		}
		
		File f2 = new File("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
		long fileSize = f2.length()/1024;
		System.out.println(fileSize+"KB");
		
		String fileName = f2.getName();
		System.out.println(fileName);
		
		String path = f2.getPath();
		System.out.println(path);
		
		if(fileName.endsWith("exe")) {
			System.out.println("응용 프로그램");
		}else if(fileName.endsWith("pdf")) {
			System.out.println("pdf 파일");
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축 파일");
		}
		
		//1970년 1월 1일 부터 마지막 수정한 날짜 까지의 시간을 밀리세컨드로 반환(return).
		//
		long lastModified = f2.lastModified();
		System.out.println(lastModified);
				
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lastModified);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		
		String date = sdf.format(c.getTime());
		System.out.println(date);
		
		File f3 = new File("c:\\dev\\Hello.java");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		File f4 = new file("cL\\dev\\HelloWorld.java");
		
		f3.renameTo(f4);
				
		
		
		
	}
}
