import java.util.Scanner;

//使用正则表达式来判断一个字符串是不是一个手机号
public class JudgePhoneNumber {
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入手机号:");
		Scanner scanner = new Scanner(System.in);
		String text =scanner.nextLine();
		System.out.println(text);
		scanner.close();
		String regExp = "^[1]([3][0-9]{1}|59|58|88|89)[0-9]{8}$";
		System.out.println(text.matches(regExp));
	}

}
