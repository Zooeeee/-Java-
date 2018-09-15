//声明成员变量age和局部变量name  比较一下两个变量的区别  并添加相应的注释


public class DifferentValue {
	//定义一个静态成员变量
	public static int age = 5  ;
	
	public static void demo() {
		//定义一个类的静态方法 其中有一个局部变量name 
		String name = new String("Test") ; 
		System.out.println("局部变量name的值为"+name);
		
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("成员变量age的值为"+age);
		//下面一行代码会报错  因为name是一个局部变量  指在demo方法内有效
		
		//System.out.println(name);
		
		//只有通过调用方法才能看到该局部变量
		demo();
		
		

	}

}
