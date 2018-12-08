//这是客户端的一个主类，可以多次运行
//实现多个客户端在同一个聊天室
//某个线程发送的消息能够被所有线程的客户端接受

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MyClient {
	
	public void createClientSocket() {
		try {
			System.out.println("客户端创建Socket");
			Socket s = new Socket("127.0.0.1", 30000);
			//客户端启动ClientThread线程不断的读取来自于服务器的数据
			//启动一个新线程开启客户端
			new Thread(new ClientThread(s)).start();
			//获得该Socket对应的输出流
			String line = null;
			PrintStream ps = new PrintStream(s.getOutputStream());
			//不断的读取键盘
			System.out.println("请输入内容");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while((line = br.readLine())!=null) {
				ps.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MyClient().createClientSocket();
	}

}

