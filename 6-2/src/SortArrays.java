import java.util.Arrays;

//编写java程序 将数组中最小的数输出
public class SortArrays {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr = new int[] {6,3,2,4}; 
		System.out.println("初始数组为"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("经过排序后的数组为"+Arrays.toString(arr));
		System.out.println("所以其最小值为："+arr[0]);
		
		

	}

}
