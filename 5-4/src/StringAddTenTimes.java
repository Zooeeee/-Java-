import java.util.Scanner;

//ʹ���ַ��������������ַ���str׷��1~10  ʮ������
public class StringAddTenTimes {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("����str�ַ�����ֵ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		sc.close();
		StringBuilder str = new StringBuilder(str1);
		System.out.println("������ַ���strΪ "+str);
		for(int i = 1 ; i <= 10 ; i++) {
			str.append(i);
		}
		System.out.println("���ʮ�����ֺ���ַ���Ϊ"+str);
	}
}
