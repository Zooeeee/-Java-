//10-2
class Parent{
	public void breath() {
		System.out.println("����ĵ�һ������ ����");
	}
	
	public void sleep() {
		System.out.println("����ĵڶ������� ˯��");
	}
}


public class Demo extends Parent {
	public void sleep() {
		System.out.println("������д����ĵڶ������� ˯��");
	}

	public static void main(String[] args) {
		Parent demo = new Demo();    //����ת��
		demo.sleep();
	}
}
