//���Ƿ����������࣬���𴴽�һ��������


import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//����ฺ�𴴽��벻ͬ�ͻ��������ӵĲ�ͬsocket
public class MyServer {
	//���屣������socket��arraylist���������װΪ�̰߳�ȫ��
	public static List<Socket> socketList = Collections.synchronizedList(new ArrayList<>()) ;
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(30000);
			while (true) {
				System.out.println("�ȴ�����������");
				Socket socket = serverSocket.accept();
				socketList.add(socket);
				//ÿ���ͻ������Ӻ�����һ��ServerThread�߳�Ϊ�ͻ��˷���
				System.out.println("����һ�����߳��ṩ����");
				new Thread(new ServerThread(socket)).start();
			}
		} catch (Exception e) {
		
		}
	}

}
