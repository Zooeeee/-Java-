import java.util.Random;


//9-1
public class Demo {
	public static int end ; 
	public static int count  ;	
	
	public static void getRandomNumber() {
		count ++ ;
		Random random = new Random();
		int result = random.nextInt(15)*2+2;
		System.out.println("��"+count+"�������Ϊ"+result);
		end += result;
	}
	
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("����5��");
		for(count = 0 ;count<5 ; ) {
			getRandomNumber();
			
		}
		System.out.println("�������֮��Ϊ"+Demo.end);
		
		

	}

}
