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
		// TODO �Զ����ɵķ������
		Demo demo = new Demo();
		demo.addToList();
		demo.addToSet();
		System.out.println("����set������Ӻ�Ľ����");
		demo.set.forEach(ele->System.out.print(ele + " "));
		
		System.out.println("\n����list������Ӻ�Ľ����");
		demo.list.forEach(ele->System.out.print(ele + " "));
		
		System.out.println("\n�ó����ۣ�list�п�������ظ�ֵ����set�в������ظ�ֵ");
		
		
		
	}

}
