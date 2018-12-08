import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {
	public Set set ;
	public List list ;
	
	public Demo() {
		this.set = new HashSet();
		this.list = new ArrayList();
	}
	
	public void addToSet() {
		set.add("A");
		set.add("a");
		set.add("c");
		set.add("C");
		set.add("a");
		
	}
	
	public void addToList() {
		list.add("A");
		list.add("a");
		list.add("c");
		list.add("C");
		list.add("a");
	}
	
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo demo = new Demo();
		demo.addToList();
		demo.addToSet();
		System.out.println("这是set集合添加后的结果：");
		demo.set.forEach(ele->System.out.print(ele + " "));
		
		System.out.println("\n这是list集合添加后的结果：");
		demo.list.forEach(ele->System.out.print(ele + " "));
		
		System.out.println("\n得出结论，list中可以添加重复值，而set中不可有重复值");
		
		
		
	}

}
