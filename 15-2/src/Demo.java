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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
	//����һ���ַ���   ����һ���ַ���
	public String encryption(String string) { 
		char[] cha = string.toCharArray();
		for (int i = 0; i < cha.length; i++) {
			cha[i] =(char)(cha[i]+5);    //�����ַ�ת��Ϊunicode��ֵ+5��ֵ
		}
		return String.valueOf(cha);
	}
	
	//����һ���ַ���  ����һ���ַ���
	public String decrypt(String string) {
		char[] cha = string.toCharArray();
		for (int i = 0; i < cha.length; i++) {
			cha[i] =(char)(cha[i]-5);    //�����ַ�ת��Ϊunicode��ֵ+5��ֵ
		}
		
		return String.valueOf(cha);
	}
	
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		File file = new File("word.txt"); //��15-2�ĸ�Ŀ¼�� ��һ��word.txt���������
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����������");
		String string = scanner.nextLine();
		System.out.println("���������ԭ�ַ���:"+string);
		System.out.println("����������ܺ���ַ�����"+demo.encryption(string));
		demo.writeTxt(file, demo.encryption(string));
		System.out.println("���ܺ��ַ���д��ɹ�");
		System.out.println("��ʱword.txt���ַ�����"+demo.printFileReader(file));
		
		System.out.println("---------------------------------------------");
		String string2 = demo.printFileReader(file);
		System.out.println("��ȡword.txt�еļ����ַ���:"+ string2);
		System.out.println("���н��ܣ����ܺ�õ�ԭ�ַ���Ϊ��"+demo.decrypt(string2));
	}
}
