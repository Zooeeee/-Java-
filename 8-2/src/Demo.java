import java.util.Scanner;

//8-2
public class Demo {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("输入一个字符");
		Character demo1 = new Character(scanner.next().charAt(0));
		System.out.println("这个字符为"+demo1.charValue());
		
		System.out.println("输入另一个字符");
		Character demo2 = new Character(scanner.next().charAt(0));
		System.out.println("这个字符为"+demo2.charValue());
		
		System.out.println("它们相等？"+demo1.equals(demo2));
		
		demo1 = demo1.toLowerCase(demo1);
		System.out.println(demo1.charValue());
		demo2 = demo2.toLowerCase(demo2);
		System.out.println(demo1.charValue());
		System.out.println("它们相等？"+demo1.equals(demo2));
		
		
		

	}

}
