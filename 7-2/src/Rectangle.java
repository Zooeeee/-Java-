//7-2
public class Rectangle {
	public int length ;
	public int width ;
	public Rectangle() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	
	public Rectangle(int length, int width ) {
		// TODO �Զ����ɵĹ��캯�����
		this.length = length ;
		this.width = width ;
	}
	
	public void getArea() {
		System.out.println("���������"+this.length * this.width);
		}
	
	public void getInfo() {
		System.out.println("�����γ�Ϊ"+this.length);
		System.out.println("�����ο�Ϊ"+this.width);
	}
	

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Rectangle  demo = new Rectangle(5,6) ;
		demo.getInfo();
		demo.getArea();
		
		
		

	}

}
