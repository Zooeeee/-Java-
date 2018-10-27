import java.util.Random;


//9-1
public class Demo {
	public static int end ; 
	public static int count  ;	
	
	public static void getRandomNumber() {
		count ++ ;
		Random random = new Random();
		int result = random.nextInt(15)*2+2;
		System.out.println("第"+count+"个随机数为"+result);
		end += result;
	}
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("生成5个");
		for(count = 0 ;count<5 ; ) {
			getRandomNumber();
			
		}
		System.out.println("这五个数之和为"+Demo.end);
		
		

	}

}
