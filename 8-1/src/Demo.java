import java.util.Scanner;

//8-1
public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("创建一个Integer对象");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		Integer in = new Integer(a);
		System.out.println("以int类型返回");
		System.out.println(in.intValue());
		
		
	}

}
