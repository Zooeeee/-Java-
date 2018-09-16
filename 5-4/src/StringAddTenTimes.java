import java.util.Scanner;

//使用字符串生成器，将字符串str追加1~10  十个数字
public class StringAddTenTimes {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("输入str字符串的值");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		sc.close();
		StringBuilder str = new StringBuilder(str1);
		System.out.println("输入的字符串str为 "+str);
		for(int i = 1 ; i <= 10 ; i++) {
			str.append(i);
		}
		System.out.println("添加十个数字后的字符串为"+str);
	}
}
