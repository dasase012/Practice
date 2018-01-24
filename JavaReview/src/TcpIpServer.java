import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			//서버소켓을 생성하여 7777번 포트와 결합(bind)시킨다.
			serverSocket = new ServerSocket(7777);
							//포트번호 7777은 내가 정하기 나름
			System.out.println(getTime()+"서버가 준비되었습니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				System.out.println(getTime()+"연결요청을 기다립니다.");
				//서버소켓은 클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다린다.
				//클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성한다.
				Socket socket = serverSocket.accept(); //accept()가 port열여놓고 연결 기다리는 상태
				System.out.println(getTime()+socket.getInetAddress()+"로부터 연결요청이 들어왔습니다.");
				
				//소켓의 출력스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				//원하는 메세지를 원격 소켓에 데이터 전송
				dos.writeUTF("[Notice] Test Message1 from Bohee's Server");
				System.out.println(getTime()+"데이터를 전송했습니다.");
				
				//스트림과 소켓을 닫아준다.
				dos.close();
				socket.close();
				//serverSocket은 굳이 따로 close할 필요 x ->그러나 객체 생성은 Socket, ServerSocket 따로 해 줘야 함
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	//현재 시간을 문자열로 반환하는 메소드
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
		
	}
}
