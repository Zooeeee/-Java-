import java.util.Scanner;

//ʹ��������ʽ���ж�һ���ַ����ǲ���һ���ֻ���
public class JudgePhoneNumber {
	
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("�������ֻ���:");
		Scanner scanner = new Scanner(System.in);
		String text =scanner.nextLine();
		System.out.println(text);
		scanner.close();
		String regExp = "^[1]([3][0-9]{1}|59|58|88|89)[0-9]{8}$";
		System.out.println(text.matches(regExp));
	}

}
