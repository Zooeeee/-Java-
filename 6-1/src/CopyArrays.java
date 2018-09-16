import java.util.Arrays;

//创建数组arr1和arr2  将数组arr1中索引位置是0-3的元素复制到数组arr2中，最后将arr1和arr2中的元素输出


public class CopyArrays {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {0,0,0,0};
		System.out.println("arr1的值为"+Arrays.toString(arr1));
		System.out.println("arr2的值为"+Arrays.toString(arr2));
		System.out.println("经过复制变换后");
		for(int i = 0 ; i <=3 ; i++ ) {
			arr2[i] = arr1[i];
		}
		System.out.println("arr1的值为"+Arrays.toString(arr1));
		System.out.println("arr2的值为"+Arrays.toString(arr2));
		

	}

}
