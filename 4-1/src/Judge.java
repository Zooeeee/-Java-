//��дjava����   �жϱ���x����������ż��
import java.util.Scanner;

public class Judge {
	
	public static void judge_number(int num) {
		if(num % 2 == 0 ) {
			System.out.println(num+"��һ��ż��");
		}
		else {
			System.out.println(num+"��һ������");
		}
		
		
	}
			
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//ݔ��һ������num
		System.out.println("������һ�����α���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("��������α�����ֵΪ"+num);
		judge_number(num);
		
		
		
	}

}
