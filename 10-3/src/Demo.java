//10-3
class Parent{
	public String name ;
	public int age ;
	
	public Parent() {
	System.out.println("����Ĺ��캯��");
	}
	
	public void test() {
		System.out.println("�����һ������");
	}
}

public class Demo extends Parent {
	public String name ;
	public int age ;
	
	public Demo() {
		System.out.println("����Ĺ��캯��");
	}
	
	public void test2() {
		System.out.println("�����һ������");
	}

	public static void main(String[] args) {
		Demo demo = new Demo();  
	/*����̨��ʾ����Ϊ
		����Ĺ��캯��
		����Ĺ��캯��
		�������ȴ����˸�������ʵ��  �ٴ����Ӷ����ʵ�� */
	}
}
