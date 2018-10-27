import java.math.BigDecimal;
import java.util.Scanner;
// 9-3
public class BigDecimalDemo {
	 	public static BigDecimal div(double value1,double value2,int accuracy,int mode){
			if(accuracy  < 0){
				System.out.println("b值必须大于等于0");
			}
			BigDecimal b1=new BigDecimal(Double.toString(value1));
			BigDecimal b2=new BigDecimal(Double.toString(value2));
			return b1.divide(b2,accuracy,mode);
		}
		public static void main(String[] args) {
			// TODO 自动生成方法存根
			BigDecimalDemo bc=new BigDecimalDemo ();
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("请输入第1个数");
			double value1 = scanner.nextDouble();
			
			System.out.println("请输入第2个数");
			double value2 = scanner.nextDouble();
			
			System.out.println("请输入保留精度");
			int accuracy = scanner.nextInt();
			
			System.out.println("请输入你想要进行的保留精度方式");
			System.out.println("1--商的最后一位如果大于0，则向前进位，正负数皆是如此");
			System.out.println("2--商的最后一位无论时什么数字都省略");
			System.out.println("3--商若是整数，则等同与6模式，如果是负数，则等同于5模式");
			System.out.println("4--与3模式相反");
			System.out.println("5--四舍五入操作，退1法");
			System.out.println("6--四舍五入操作，进1法");
			System.out.println("7--若商的倒数第二位是奇数，则为6模式。反之，则为5模式");
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
				System.out.println("输入有误，结束程序");
				break;
			}
		}
}
