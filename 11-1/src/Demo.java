//11-1
interface Person{
	public int getAge();
	public String getName();
}

public class Demo {
	public void test(Person p) {
		System.out.println("����˽�"+p.getName()+"����Ϊ"+p.getAge());
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Demo demo = new Demo();
		demo.test(new Person() {
			public String getName() {
				return "����";
			}
			public int getAge() {
				return 21;
			}
		});
	}
}
