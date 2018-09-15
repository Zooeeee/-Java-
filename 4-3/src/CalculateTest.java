//运用while循环语句计算1！+ 1/2！ + 1/3！+...+1/20！  的和
public class CalculateTest {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	
		double sum = 0,item = 1;
		int i = 1,n = 20;
		while(i<=n) {
			sum = sum+item;
			i = i+1;
			//3！比2！多了一个 3  
			item = item*(1.0/i);
		}
		System.out.println("1！+ 1/2！ + 1/3！+...+1/20！的和为"+sum);
}
}
