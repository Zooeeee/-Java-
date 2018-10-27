//7-2
public class Rectangle {
	public int length ;
	public int width ;
	public Rectangle() {
		// TODO 自动生成的构造函数存根
	}
	
	
	public Rectangle(int length, int width ) {
		// TODO 自动生成的构造函数存根
		this.length = length ;
		this.width = width ;
	}
	
	public void getArea() {
		System.out.println("长方形面积"+this.length * this.width);
		}
	
	public void getInfo() {
		System.out.println("长方形长为"+this.length);
		System.out.println("长方形宽为"+this.width);
	}
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Rectangle  demo = new Rectangle(5,6) ;
		demo.getInfo();
		demo.getArea();
		
		
		

	}

}
