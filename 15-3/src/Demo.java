import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Demo {
	public String[] getNameAndPassword(Scanner scanner) {
		System.out.println("�������û�����");
		String name = scanner.nextLine();
		System.out.println("���������룺");
		String password = scanner.nextLine();
		String[] result = {(String)name,(String)password};
		return result;
	}
	
	public void putNameAndPassword(File file , String[] strings) {
		String name = strings[0];
		String password = strings[1];
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file,true);
			byte buy[] = ("������"+name+"  ���룺"+password+"\r\n").getBytes(); 
			fileOutputStream.write(buy);
			fileOutputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		File file = new File("word.txt");
		Scanner scanner = new Scanner(System.in);
		String[] strings = demo.getNameAndPassword(scanner);
		demo.putNameAndPassword(file, strings);
		
	
	
	
	
	
	}
}
