//����whileѭ��������1��+ 1/2�� + 1/3��+...+1/20��  �ĺ�
public class CalculateTest {
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	
		double sum = 0,item = 1;
		int i = 1,n = 20;
		while(i<=n) {
			sum = sum+item;
			i = i+1;
			//3����2������һ�� 3  
			item = item*(1.0/i);
		}
		System.out.println("1��+ 1/2�� + 1/3��+...+1/20���ĺ�Ϊ"+sum);
}
}
