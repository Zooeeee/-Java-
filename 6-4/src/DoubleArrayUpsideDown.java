import java.util.Arrays;

/*将二维数组的行列颠倒过来
 例如   1 2 3
     4 5 6
     7 8 9
变成
	 1 4 7
	 2 5 8
	 3 6 9
 */


public class DoubleArrayUpsideDown {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("以下是原数组:");
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		//变化
		//如果直接int[][]arr1 = arr的话 只是创建另一个指向该二维数组的指针而已  不能形成副本
		//重新创建一个 新的同样的二维数组    这样开销会变大
		int[][] arr1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[0].length ; j ++) {
				arr[i][j] = arr1[j][i];
			}
		}
		System.out.println("以下是变换后的数组:");
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		
		
		

	}

}
