import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		Emp emp1 = new Emp("015");
		Emp emp2 = new Emp("002");
		Emp emp3 = new Emp("999");

		Map map = new HashMap();
		map.put(emp1.id, emp1);
		map.put(emp2.id, emp2);
		map.put(emp3.id, emp3);
		
		System.out.println("�����Ƴ�idΪ015��Emp����֮ǰ��map");
		map.forEach((key,value)->{
			System.out.println(key+":"+value);
		});
		
		map.remove("015");
		System.out.println("----------------------");
		System.out.println("�����Ƴ�idΪ015��Emp����֮���map");
		map.forEach((key,value)->{
			System.out.println(key+":"+value);
		});
		
		
	}

}
