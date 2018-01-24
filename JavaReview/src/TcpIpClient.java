import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient {
	public static void main(String[] args) {
		try {
			String serverIp = "211.238.142.28";
			//서버의 ip주소를 입력해야함
			
			
			System.out.println("서버에 연결중입니다. 서버IP: "+serverIp);
			
			//소켓을 생성하여 연결을 요청한다.Socket 생성자가 생기면 connection이 이루어진거
			Socket socket = new Socket(serverIp, 7777);
								//내가 정한 포트번호에 맞춰서 들어가야함.
			//소켓의 입력스트림을 얻는다.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			//--> Input/OutputStream을 사용할 때는 가시화된 출력물을 읽어내기 위해서는
			//반드시 DataInputStream이 아니더라도 동류의 보조스트림을 사용해야함.
			
			//소켓으로부터 받은 데이터를 출력한다.
			System.out.println("서버로부터 받은 메시지:"+dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			//스트림과 소켓을 닫는다.
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");
			
		}catch(ConnectException ce) {
			ce.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
