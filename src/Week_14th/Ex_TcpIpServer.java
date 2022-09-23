package Week_14th;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_TcpIpServer {
	
	// ����ð��� ���ڿ��� ��ȯ
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		
		try {
			// ���������� �����Ͽ� 7777�� ��Ʈ�� ����(bind)��Ų��.
			serverSocket = new ServerSocket(4532);
			System.out.println(getTime()+"������ �غ�Ǿ����ϴ�.");

		} catch(IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				System.out.println(getTime()+"�����û�� ��ٸ��ϴ�.");
				// ���������� Ŭ���̾�Ʈ�� �����û�� �� ������ ������ ���߰� ��� ��ٸ���.
                // Ŭ���̾�Ʈ�� �����û�� ���� Ŭ���̾�Ʈ ���ϰ� ����� ���ο� ������ �����Ѵ�.
				Socket socket = serverSocket.accept();
				System.out.println(getTime()+ socket.getInetAddress() + "�κ��� �����û�� ���Խ��ϴ�.");
				
				// ������ ��½�Ʈ���� ��´�.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);

				// ���� ����(remote socket)�� �����͸� ������.
				dos.writeUTF("[Notice] Test Message1 from Server. 2121085 ��ȣ��");
				System.out.println(getTime()+"�����͸� �����߽��ϴ�.");

				// ��Ʈ���� ������ �ݾ��ش�.
				dos.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // while
	}
}
