import java.util.ArrayList;
import java.util.List;

//14-1
public class ListDemo {
	
	

	public static void main(String[] args) {
		//��������1-100��list
		List list = new ArrayList();
		for(int i = 1 ; i <= 100 ; i++) {
			list.add(i);
		}
		//��ӡlist
		list.forEach(ele -> System.out.print(ele+" "));
		
		//�Ƴ�����λ����10��Ԫ��
		list.remove(10);
		System.out.println();
		list.forEach(ele -> System.out.print(ele+" "));
		
		System.out.println("\n�۲��������� ��������λ��Ϊ10 ֵΪ11��Ԫ�ر��Ƴ���");
	}

}
