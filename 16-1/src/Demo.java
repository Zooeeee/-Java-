import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;;

public class Demo {
	

public static Object goodCopyOf(Object arr,int newLength){//该方法可以 用来扩展任意类型的数组
        Class cclass =  arr.getClass();
        Class componentType = cclass.getComponentType();//返回数组中的组件类型
        int length = Array.getLength(arr);
        Object newArray = Array.newInstance(componentType,newLength);
        System.arraycopy(arr,0,newArray,0,length>newLength?newLength:length);
        return  newArray;
    }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[]{1,2};
		System.out.println("这是源数组arr："+Arrays.toString(arr));
		
		System.out.println("请输入数组变化后的长度");
		int newLength = scanner.nextInt();
		
		int[] arr2 = (int[]) goodCopyOf(arr,newLength);
		System.out.println("这是增加长度后的数组arr2："+Arrays.toString(arr2));
}

}