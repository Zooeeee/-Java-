import java.util.Scanner;

//8-2
public class Demo {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����һ���ַ�");
		Character demo1 = new Character(scanner.next().charAt(0));
		System.out.println("����ַ�Ϊ"+demo1.charValue());
		
		System.out.println("������һ���ַ�");
		Character demo2 = new Character(scanner.next().charAt(0));
		System.out.println("����ַ�Ϊ"+demo2.charValue());
		
		System.out.println("������ȣ�"+demo1.equals(demo2));
		
		demo1 = demo1.toLowerCase(demo1);
		System.out.println(demo1.charValue());
		demo2 = demo2.toLowerCase(demo2);
		System.out.println(demo1.charValue());
		System.out.println("������ȣ�"+demo1.equals(demo2));
		
		
		

	}

}
