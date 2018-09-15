//运用for循环打印一个菱形
import java.util.Scanner;

public class Diamond {
	
	public static void print_diamond(int num) {
		for(int m = 1; m <=(num+1)/2; m++)//正序输出上半部分
        {
            for(int b = 1; b <=(num+1)/2-m ; b++)//输出空格
            {
                System.out.print(" ");
            }
            for(int c = 1; c <= m*2-1; c++)
            {
                System.out.print("+");    
            }
            System.out.println();//换行
        }
        for(int d =(num+1)/2-1;d >= 1; d --)//倒序输出下半部分
        {
            for(int b = 1; b <= (num+1)/2-d; b++)//输出空格
            {
                System.out.print(" ");
            }
            for(int c = (num+1)/2-d; c <=(num+1)/2-2+d; c ++)//(lay+1)/2-1即为下半个三角形
            {
                System.out.print("+");    
            }
            System.out.println();
        }
        
    }
		
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入一个整形变量");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		print_diamond(num);
	
	}

}
