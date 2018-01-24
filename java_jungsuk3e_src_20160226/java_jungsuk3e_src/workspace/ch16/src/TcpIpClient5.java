import java.net.*;
import java.io.*;

public class TcpIpClient5 {
	public static void main(String args[]) {
		try {
			String serverIp = "127.0.0.1";
            
			// 소켓을 생성하여 연결을 요청한다.
			Socket socket = new Socket(serverIp, 7777); 

			System.out.println("서버에 연결되었습니다.");
			
			//OutputStream이 포함된 Sender 클래스 생성->Sender 생성자 생성
			Sender sender = new Sender(socket);
						
			//InputStream이 포함된 Sender 클래스 생성->Sender 생성자 생성
			Receiver receiver = new Receiver(socket);

			sender.start(); //main 쓰레드 외의 sender 쓰레드 오픈,실행(start->run)
			receiver.start();//main 쓰레드 외의 receiver 쓰레드 오픈,실행(start->run)
			
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(IOException ie) {  
			ie.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();  
		}  
	} // main
} // class
