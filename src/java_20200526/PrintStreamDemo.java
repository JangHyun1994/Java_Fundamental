package java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
//		
//		PrintStream monitor = System.out;
//		monitor.println("Hello World!");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		fis = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
		
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream("c:\\dev\\Git4.exe");
		bos = new BufferedOutputStream(fos);
		ps = new PrintStream(bos, true);
		
		int readByte = 0;
		while((readByte = bis.read()) != -1) {
			ps.write(readByte);
		}
		
	}catch (FileNotFoundException e) {
		e.printStackTrace();
		
	}
		
}
