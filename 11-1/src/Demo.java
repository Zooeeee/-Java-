//11-1
interface Person{
	public int getAge();
	public String getName();
}

public class Demo {
	public void test(Person p) {
		System.out.println("这个人叫"+p.getName()+"年龄为"+p.getAge());
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo demo = new Demo();
		demo.test(new Person() {
			public String getName() {
				return "张尹";
			}
			public int getAge() {
				return 21;
			}
		});
	}
}
