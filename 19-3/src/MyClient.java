//���ǿͻ��˵�һ�����࣬���Զ������
//ʵ�ֶ���ͻ�����ͬһ��������
//ĳ���̷߳��͵���Ϣ�ܹ��������̵߳Ŀͻ��˽���

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MyClient {
	
	public void createClientSocket() {
		try {
			System.out.println("�ͻ��˴���Socket");
			Socket s = new Socket("127.0.0.1", 30000);
			//�ͻ�������ClientThread�̲߳��ϵĶ�ȡ�����ڷ�����������
			//����һ�����߳̿����ͻ���
			new Thread(new ClientThread(s)).start();
			//��ø�Socket��Ӧ�������
			String line = null;
			PrintStream ps = new PrintStream(s.getOutputStream());
			//���ϵĶ�ȡ����
			System.out.println("����������");
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

