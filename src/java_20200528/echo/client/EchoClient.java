package java_20200528.echo.client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient {
	private String ip;
	private int port;
	
	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	
	public void run() {
		Socket socket = null;
		
		try {
			//3. Socket 객체를 생성하여 서버와 연결을 시도한다.
			socket = new Socket(ip,port);
			//4. Socket 객체로 출력 스트림을 생성하여 서버로 메시지를 보낸다.
			OutputStream out = socket.getOutputStream();
			// stream chain
			OutputStreamWriter osw = new OutputStreamWriter(out);
			//stream chain
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("안녕하세요....저는 이장현 입니다...");
			bw.newLine();
			bw.flush();
			
			
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new EchoClient("192.168.0.141", 3000).run();
		
	}
	
}
