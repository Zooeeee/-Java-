import java.util.Arrays;

//��������arr1��arr2  ������arr1������λ����0-3��Ԫ�ظ��Ƶ�����arr2�У����arr1��arr2�е�Ԫ�����


public class CopyArrays {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {0,0,0,0};
		System.out.println("arr1��ֵΪ"+Arrays.toString(arr1));
		System.out.println("arr2��ֵΪ"+Arrays.toString(arr2));
		System.out.println("�������Ʊ任��");
		for(int i = 0 ; i <=3 ; i++ ) {
			arr2[i] = arr1[i];
		}
		System.out.println("arr1��ֵΪ"+Arrays.toString(arr1));
		System.out.println("arr2��ֵΪ"+Arrays.toString(arr2));
		

	}

}
