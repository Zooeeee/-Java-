import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;;

public class Demo {
	

public static Object goodCopyOf(Object arr,int newLength){//�÷������� ������չ�������͵�����
        Class cclass =  arr.getClass();
        Class componentType = cclass.getComponentType();//���������е��������
        int length = Array.getLength(arr);
        Object newArray = Array.newInstance(componentType,newLength);
        System.arraycopy(arr,0,newArray,0,length>newLength?newLength:length);
        return  newArray;
    }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[]{1,2};
		System.out.println("����Դ����arr��"+Arrays.toString(arr));
		
		System.out.println("����������仯��ĳ���");
		int newLength = scanner.nextInt();
		
		int[] arr2 = (int[]) goodCopyOf(arr,newLength);
		System.out.println("�������ӳ��Ⱥ������arr2��"+Arrays.toString(arr2));
}

}