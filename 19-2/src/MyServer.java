import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	
	private Socket socket;
	PrintWriter printWriter;
	
	public MyServer() {
		try {
			ServerSocket serverSocket = new ServerSocket(8001);
			System.out.println("����������");
			socket = serverSocket.accept();
			System.out.println("���ӳɹ�");
			putInfo();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void putInfo() {
		try {
			printWriter = new PrintWriter(socket.getOutputStream());
			printWriter.write("���������ڷ������˵���Ϣ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			printWriter.close();
		}
	}
	

	public static void main(String[] args) {
		new MyServer();
	}

}
