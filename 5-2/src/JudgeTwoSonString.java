//分别截取字符串str1和str2的部份内用 比较是否相同
import java.util.Scanner;

public class JudgeTwoSonString {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SonString str1 = new SonString();
		str1.sub();
		SonString str2 = new SonString();
		str2.sub();
		int result = str1.value.compareTo(str2.value);
		if (result == 0 )
			{System.out.println("这两个子字符串相同");}
		else
			{System.out.println("这两个子字符串不相同");}
		}

}

class SonString{
	public String value;
	private Scanner sc = new Scanner(System.in);
	//构造函数 生成实例并且输入字符串的值
	public SonString() {
		System.out.println("输入一个字符串");
		this.value = sc.nextLine();
		System.out.println("这个字符串为"+this.value);
	}
	
	public void sub() {
		System.out.println("输入想要截取的起始位置");
		int a = sc.nextInt()-1;
		//System.out.println(a);
		System.out.println("输入想要截取的终止位置(不包括)");
		int b = sc.nextInt()-1;
		//System.out.println(b);
		this.value = this.value.substring(a, b);
		System.out.println(this.value);
	}
	
}