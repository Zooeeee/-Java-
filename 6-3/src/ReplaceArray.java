import java.util.Arrays;

//ʵ�ֽ�����arr������λ����2��Ԫ���滻�ɡ�bb�� �����滻ǰ������Ԫ�غ��滻�������Ԫ��ȫ�����
public class ReplaceArray {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String[] arr = new String[] {"aa","bb","cc","dd"};
		System.out.println("�滻ǰ������Ϊ"+Arrays.toString(arr));
		arr[3] = "bb";
		System.out.println("�滻�������Ϊ"+Arrays.toString(arr));
		
		

	}

}
