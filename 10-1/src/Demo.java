//10-1
abstract class AbstractClass{
	public abstract void test();
	
}

public class Demo {

	public static void main(String[] args) {
		// 报错  ： 不能实例化类型
		AbstractClass abstractClass = new AbstractClass() ;
	}

}
