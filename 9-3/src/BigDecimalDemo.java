import java.math.BigDecimal;
import java.util.Scanner;
// 9-3
public class BigDecimalDemo {
	 	public static BigDecimal div(double value1,double value2,int accuracy,int mode){
			if(accuracy  < 0){
				System.out.println("bֵ������ڵ���0");
			}
			BigDecimal b1=new BigDecimal(Double.toString(value1));
			BigDecimal b2=new BigDecimal(Double.toString(value2));
			return b1.divide(b2,accuracy,mode);
		}
		public static void main(String[] args) {
			// TODO �Զ����ɷ������
			BigDecimalDemo bc=new BigDecimalDemo ();
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("�������1����");
			double value1 = scanner.nextDouble();
			
			System.out.println("�������2����");
			double value2 = scanner.nextDouble();
			
			System.out.println("�����뱣������");
			int accuracy = scanner.nextInt();
			
			System.out.println("����������Ҫ���еı������ȷ�ʽ");
			System.out.println("1--�̵����һλ�������0������ǰ��λ���������������");
			System.out.println("2--�̵����һλ����ʱʲô���ֶ�ʡ��");
			System.out.println("3--���������������ͬ��6ģʽ������Ǹ��������ͬ��5ģʽ");
			System.out.println("4--��3ģʽ�෴");
			System.out.println("5--���������������1��");
			System.out.println("6--���������������1��");
			System.out.println("7--���̵ĵ����ڶ�λ����������Ϊ6ģʽ����֮����Ϊ5ģʽ");
			int mode = scanner.nextInt();
			
			switch (mode) {
			case 1:
				System.out.println(bc.div(value1,value2,accuracy,BigDecimal.ROUND_UP));
				break;
			case 2:
				System.out.println(bc.div(value1,value2,accuracy,BigDecimal.ROUND_DOWN));
				break;
			case 3:
				System.out.println(bc.div(value1,value2,accuracy,BigDecimal.ROUND_CEILING));
				break;
			case 4:
				System.out.println(bc.div(value1,value2,accuracy,BigDecimal.ROUND_FLOOR));
				break;
			case 5:
				System.out.println(bc.div(value1,value2,accuracy,BigDecimal.ROUND_HALF_DOWN));
				break;
			case 6:
				System.out.println(bc.div(value1,value2,accuracy,BigDecimal.ROUND_HALF_UP));
				break;
			case 7:
				System.out.println(bc.div(value1,value2,accuracy,BigDecimal.ROUND_HALF_EVEN));
				break;

			default:
				System.out.println("�������󣬽�������");
				break;
			}
		}
}
