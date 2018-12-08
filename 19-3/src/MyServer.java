//这是服务器的主类，负责创建一个服务器


import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//这个类负责创建与不同客户端相连接的不同socket
public class MyServer {
	//定义保存所有socket的arraylist，并将其包装为线程安全的
	public static List<Socket> socketList = Collections.synchronizedList(new ArrayList<>()) ;
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(30000);
			while (true) {
				System.out.println("等待服务器连接");
				Socket socket = serverSocket.accept();
				socketList.add(socket);
				//每当客户端链接后启动一个ServerThread线程为客户端服务
				System.out.println("启动一个新线程提供服务");
				new Thread(new ServerThread(socket)).start();
			}
		} catch (Exception e) {
		
		}
	}

}
