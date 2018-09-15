//编写java程序   判断变量x是奇数还是偶数
import java.util.Scanner;

public class Judge {
	
	public static void judge_number(int num) {
		if(num % 2 == 0 ) {
			System.out.println(num+"是一个偶数");
		}
		else {
			System.out.println(num+"是一个奇数");
		}
		
		
	}
			
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//輸入一個整形num
		System.out.println("请输入一个整形变量");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("输入的整形变量的值为"+num);
		judge_number(num);
		
		
		
	}

}
