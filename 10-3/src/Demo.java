//10-3
class Parent{
	public String name ;
	public int age ;
	
	public Parent() {
	System.out.println("父类的构造函数");
	}
	
	public void test() {
		System.out.println("父类的一个方法");
	}
}

public class Demo extends Parent {
	public String name ;
	public int age ;
	
	public Demo() {
		System.out.println("子类的构造函数");
	}
	
	public void test2() {
		System.out.println("子类的一个方法");
	}

	public static void main(String[] args) {
		Demo demo = new Demo();  
	/*控制台显示内容为
		父类的构造函数
		子类的构造函数
		所以是先创建了父类对象的实例  再创建子对象的实例 */
	}
}
