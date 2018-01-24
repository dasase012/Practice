import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
	public static void main(String[] args) throws IOException{
		ServerSocket server = new ServerSocket(8800);
		while(true) {
			System.out.println("접속 대기 중");
			Socket client = server.accept();
			System.out.println("클라이언트가 연결됨,스레드 생성");
			HttpThread ht = new HttpThread(client);
			ht.start();
		}
	}
}//Class SimpleWebServer
class HttpThread extends Thread{
	private Socket client;
	BufferedReader br;
	PrintWriter pw;
	HttpThread(Socket client){
		this.client = client;
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}//HttpThread
	public void run() {
		BufferedReader fbr = null;
		try {
			String line = br.readLine();
			System.out.println("Http Header:"+line);
			int start = line.indexOf("/")+1;
			int end = line.indexOf("HTTP")-1;
			String fileName = line.substring(start,end);
			if(fileName.equals(""))
				fileName = "bohee.html";
			System.out.println("사용자 요청파일:"+fileName);
			fbr = new BufferedReader(new FileReader("webroot=WebContent/"+fileName));
			String fileData = null;
			while((fileData = fbr.readLine())!=null) {
				pw.println(fileData);
				pw.flush();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fbr!=null) fbr.close();
				if(br!=null)br.close();
				if(pw!=null)pw.close();
				if(client!=null)client.close();
			}catch(IOException e) {
				
			}
		}
	}//run
}
