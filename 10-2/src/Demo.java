//10-2
class Parent{
	public void breath() {
		System.out.println("父类的第一个方法 呼吸");
	}
	
	public void sleep() {
		System.out.println("父类的第二个方法 睡觉");
	}
}


public class Demo extends Parent {
	public void sleep() {
		System.out.println("子类重写父类的第二个方法 睡觉");
	}

	public static void main(String[] args) {
		Parent demo = new Demo();    //向上转型
		demo.sleep();
	}
}
