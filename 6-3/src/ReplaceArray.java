import java.util.Arrays;

//实现将数组arr中索引位置是2的元素替换成“bb” 并将替换前的数组元素和替换后的数组元素全部输出
public class ReplaceArray {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] arr = new String[] {"aa","bb","cc","dd"};
		System.out.println("替换前的数组为"+Arrays.toString(arr));
		arr[3] = "bb";
		System.out.println("替换后的数组为"+Arrays.toString(arr));
		
		

	}

}
