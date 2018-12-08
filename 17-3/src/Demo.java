import java.util.ArrayList;
import java.util.List;

public class Demo<T> {

	
	public static void test(List<Object> list) {
		list.forEach(ele->System.out.println(ele));
	}
	
	public static void test2(List<?> list) {
		list.forEach(ele->System.out.println(ele));
	}
	
	
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("a");
		stringList.add("b");
		stringList.add("c");
		
		
		//下面代码会报错
		//test(stringList);
		
		//下面代码不会报错
		test2(stringList);
		
		
	}

}
