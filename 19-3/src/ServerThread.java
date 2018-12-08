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
			//遍历socketlist中的每一个socket，向它们都传输读到的值
			for(Socket socket : MyServer.socketList) {
				try {
					PrintStream printStream = new PrintStream(socket.getOutputStream());
					printStream.println("某用户: "+content);
					System.out.println("服务端记录: " + content);
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
			//删除该Socket
			System.out.println("Socket出现问题，删除");
			MyServer.socketList.remove(socket);
		}
		return null;
	}
	
}
