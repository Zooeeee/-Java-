import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
	
	
	public  String printFileReader(File file ) {
		String result = new String();
		try {
			FileReader fileReader = new FileReader(file);
			char byt[] = new char[1024];
			int len = fileReader.read(byt);
			result = new String(byt,0,len);
			fileReader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void writeTxt(File file,String string) {
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(string);
			fileWriter.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	//加密一个字符串   返回一个字符串
	public String encryption(String string) { 
		char[] cha = string.toCharArray();
		for (int i = 0; i < cha.length; i++) {
			cha[i] =(char)(cha[i]+5);    //所有字符转化为unicode码值+5的值
		}
		return String.valueOf(cha);
	}
	
	//解密一个字符串  返回一个字符串
	public String decrypt(String string) {
		char[] cha = string.toCharArray();
		for (int i = 0; i < cha.length; i++) {
			cha[i] =(char)(cha[i]-5);    //所有字符转化为unicode码值+5的值
		}
		
		return String.valueOf(cha);
	}
	
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		File file = new File("word.txt"); //在15-2的根目录中 有一个word.txt来存放密码
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入密码");
		String string = scanner.nextLine();
		System.out.println("这是密码的原字符串:"+string);
		System.out.println("这是密码加密后的字符串："+demo.encryption(string));
		demo.writeTxt(file, demo.encryption(string));
		System.out.println("加密后字符串写入成功");
		System.out.println("此时word.txt中字符串："+demo.printFileReader(file));
		
		System.out.println("---------------------------------------------");
		String string2 = demo.printFileReader(file);
		System.out.println("读取word.txt中的加密字符串:"+ string2);
		System.out.println("进行解密，解密后得到原字符串为："+demo.decrypt(string2));
	}
}
