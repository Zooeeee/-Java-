import java.net.*;
import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫ��ѯ������\n");
			String find = scanner.nextLine();
			scanner.close();
			InetAddress ip = InetAddress.getByName(find); //����Ҫ��ѯ��ip��ַ����
			System.out.println("��������" + ip.getHostName());
			System.out.println("����IP��ַ��" + ip.getHostAddress());
			//�����Ǳ�����ַ
			System.out.println("��������"+ InetAddress.getLocalHost().getHostName());
			System.out.println("����IP��ַ��"+ InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
