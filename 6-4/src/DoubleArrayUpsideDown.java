import java.util.Arrays;

/*����ά��������еߵ�����
 ����   1 2 3
     4 5 6
     7 8 9
���
	 1 4 7
	 2 5 8
	 3 6 9
 */


public class DoubleArrayUpsideDown {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("������ԭ����:");
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		//�仯
		//���ֱ��int[][]arr1 = arr�Ļ� ֻ�Ǵ�����һ��ָ��ö�ά�����ָ�����  �����γɸ���
		//���´���һ�� �µ�ͬ���Ķ�ά����    ������������
		int[][] arr1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[0].length ; j ++) {
				arr[i][j] = arr1[j][i];
			}
		}
		System.out.println("�����Ǳ任�������:");
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		
		
		

	}

}
