import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;



public class ServerThread implements Runnable{
	
	private Socket socket = null ;
	private BufferedReader bufferedReader;
	
	public ServerThread(Socket socket) {
		try {
			this.socket = socket;
			this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		String content  = null;
		while ((content = readFromClient()) != null) {
			//����socketlist�е�ÿһ��socket�������Ƕ����������ֵ
			for(Socket socket : MyServer.socketList) {
				try {
					PrintStream printStream = new PrintStream(socket.getOutputStream());
					printStream.println("ĳ�û�: "+content);
					System.out.println("����˼�¼: " + content);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	private String readFromClient() {
		try {
			return bufferedReader.readLine();
		} catch (IOException e) {
			//ɾ����Socket
			System.out.println("Socket�������⣬ɾ��");
			MyServer.socketList.remove(socket);
		}
		return null;
	}
	
}
