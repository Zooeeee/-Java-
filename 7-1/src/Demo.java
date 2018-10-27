//7-1
public class Demo {
	
	private int private_value ;
	public int getPrivate_value() {
		return private_value;
	}

	public void setPrivate_value(int private_value) {
		this.private_value = private_value;
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SeconedDemo sDemo = new SeconedDemo();
		sDemo.setPrivate_value(5);
		System.out.println(sDemo.getPrivate_value());
		
		
	}

}

class SeconedDemo extends Demo {
	public SeconedDemo() {
	}
}