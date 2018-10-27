import java.text.DecimalFormat;
import java.util.Scanner;
//9-2

public class Circle {
	public double r ;
	
	public Circle() {
	}
	
	public Circle(double r) {
		this.r = r ;
	}
	
	public String getArea() {
		double f = this.r*this.r*Math.PI;
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(f);
	}
	
	public static void main(String[] args) {
	
		System.out.println("输入圆的半径");
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		Circle circle = new Circle(r);
		System.out.println("该圆的面积为"+circle.getArea());
		

	}

}
