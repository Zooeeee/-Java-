//����forѭ����ӡһ������
import java.util.Scanner;

public class Diamond {
	
	public static void print_diamond(int num) {
		for(int m = 1; m <=(num+1)/2; m++)//��������ϰ벿��
        {
            for(int b = 1; b <=(num+1)/2-m ; b++)//����ո�
            {
                System.out.print(" ");
            }
            for(int c = 1; c <= m*2-1; c++)
            {
                System.out.print("+");    
            }
            System.out.println();//����
        }
        for(int d =(num+1)/2-1;d >= 1; d --)//��������°벿��
        {
            for(int b = 1; b <= (num+1)/2-d; b++)//����ո�
            {
                System.out.print(" ");
            }
            for(int c = (num+1)/2-d; c <=(num+1)/2-2+d; c ++)//(lay+1)/2-1��Ϊ�°��������
            {
                System.out.print("+");    
            }
            System.out.println();
        }
        
    }
		
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("������һ�����α���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		print_diamond(num);
	
	}

}
