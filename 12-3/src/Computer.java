import java.util.Scanner;
//12-3
class MyExcption extends Exception{
	public MyExcption(String ErrorMessage) {
		super(ErrorMessage);
	}
}

public class Computer {
	public static int calculate(int m , int n)throws MyExcption {
		
		if ( m < 0 || n < 0  ) { 
		//if ( m <= 0 || n <= 0  ) { �������� ������� =�ŵĻ�  ��������ʲô�������쳣����	
		throw new MyExcption("�������ݴ����и���");
		}
		return n==0?m:calculate(n,m%n);
	}
	
	public static void main(String[] args) {
		System.out.println("����������  �������Լ��");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		try {
			System.out.println(calculate(m, n));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
