//11-3
public class Demo {
	static class Inner{
		public void test() {
			System.out.println("�ڲ����test����");
		}
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Demo.Inner demo = new Demo.Inner();
		demo.test();
	}

}
