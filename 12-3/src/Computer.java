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
		//if ( m <= 0 || n <= 0  ) { 这里很奇怪 如果加了 =号的话  无论输入什么都会有异常出现	
		throw new MyExcption("参数传递错误，有负数");
		}
		return n==0?m:calculate(n,m%n);
	}
	
	public static void main(String[] args) {
		System.out.println("输入两个数  求其最大公约数");
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
