import java.net.*;
import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入要查询的主机\n");
			String find = scanner.nextLine();
			scanner.close();
			InetAddress ip = InetAddress.getByName(find); //创建要查询的ip地址对象
			System.out.println("主机名：" + ip.getHostName());
			System.out.println("主机IP地址：" + ip.getHostAddress());
			//以下是本机地址
			System.out.println("本机名："+ InetAddress.getLocalHost().getHostName());
			System.out.println("本机IP地址："+ InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
