import java.util.ArrayList;
import java.util.List;

//14-1
public class ListDemo {
	
	

	public static void main(String[] args) {
		//创建包含1-100的list
		List list = new ArrayList();
		for(int i = 1 ; i <= 100 ; i++) {
			list.add(i);
		}
		//打印list
		list.forEach(ele -> System.out.print(ele+" "));
		
		//移除索引位置是10的元素
		list.remove(10);
		System.out.println();
		list.forEach(ele -> System.out.print(ele+" "));
		
		System.out.println("\n观察上述两行 发现索引位置为10 值为11的元素被移除了");
	}

}
