//�ֱ��ȡ�ַ���str1��str2�Ĳ������� �Ƚ��Ƿ���ͬ
import java.util.Scanner;

public class JudgeTwoSonString {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		SonString str1 = new SonString();
		str1.sub();
		SonString str2 = new SonString();
		str2.sub();
		int result = str1.value.compareTo(str2.value);
		if (result == 0 )
			{System.out.println("���������ַ�����ͬ");}
		else
			{System.out.println("���������ַ�������ͬ");}
		}

}

class SonString{
	public String value;
	private Scanner sc = new Scanner(System.in);
	//���캯�� ����ʵ�����������ַ�����ֵ
	public SonString() {
		System.out.println("����һ���ַ���");
		this.value = sc.nextLine();
		System.out.println("����ַ���Ϊ"+this.value);
	}
	
	public void sub() {
		System.out.println("������Ҫ��ȡ����ʼλ��");
		int a = sc.nextInt()-1;
		//System.out.println(a);
		System.out.println("������Ҫ��ȡ����ֹλ��(������)");
		int b = sc.nextInt()-1;
		//System.out.println(b);
		this.value = this.value.substring(a, b);
		System.out.println(this.value);
	}
	
}