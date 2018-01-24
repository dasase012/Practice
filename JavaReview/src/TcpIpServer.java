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
			//���������� �����Ͽ� 7777�� ��Ʈ�� ����(bind)��Ų��.
			serverSocket = new ServerSocket(7777);
							//��Ʈ��ȣ 7777�� ���� ���ϱ� ����
			System.out.println(getTime()+"������ �غ�Ǿ����ϴ�.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				System.out.println(getTime()+"�����û�� ��ٸ��ϴ�.");
				//���������� Ŭ���̾�Ʈ�� �����û�� �� ������ ������ ���߰� ��� ��ٸ���.
				//Ŭ���̾�Ʈ�� �����û�� ���� Ŭ���̾�Ʈ ���ϰ� ����� ���ο� ������ �����Ѵ�.
				Socket socket = serverSocket.accept(); //accept()�� port�������� ���� ��ٸ��� ����
				System.out.println(getTime()+socket.getInetAddress()+"�κ��� �����û�� ���Խ��ϴ�.");
				
				//������ ��½�Ʈ���� ��´�.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				//���ϴ� �޼����� ���� ���Ͽ� ������ ����
				dos.writeUTF("[Notice] Test Message1 from Bohee's Server");
				System.out.println(getTime()+"�����͸� �����߽��ϴ�.");
				
				//��Ʈ���� ������ �ݾ��ش�.
				dos.close();
				socket.close();
				//serverSocket�� ���� ���� close�� �ʿ� x ->�׷��� ��ü ������ Socket, ServerSocket ���� �� ��� ��
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	//���� �ð��� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
		
	}
}
