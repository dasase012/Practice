import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpMultichatClient {
	public static void main(String[] args) {
		String name = "이보희";
		try {
			String serverIp = "211.238.142.20";
			
			Socket socket = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
			
			Thread sender = new Thread(new ClientSender(socket,name));
			Thread receiver = new Thread(new ClientReceiver(socket));
			
			sender.start();
			receiver.start();
		}catch(ConnectException ce) {
			ce.printStackTrace();
		}catch(Exception e) {
			
		}
		
	}
	
	static class ClientSender extends Thread{
		Socket socket;
		DataOutputStream out;
		String name;
		
		ClientSender(Socket socket, String name){
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			}catch(Exception e) {
				
			}
		}
		public void run() {
			Scanner scanner = new Scanner(System.in);
			try {
				if(out!=null) {
					out.writeUTF(name);
				}
				while(out!=null) {
					out.writeUTF("["+name+"]"+scanner.nextLine());
				}
				
			}catch(IOException e) {
				
			}
		}
	}
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		
		ClientReceiver(Socket socket){
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			}catch(Exception e) {
				
			}
		}
		public void run() {
			while(in!=null) {
				try {
					System.out.println(in.readUTF());
				}catch(IOException e) {
					
				}
			}
		}
	}
}
