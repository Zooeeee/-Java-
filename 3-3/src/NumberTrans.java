//��дjavc���򣬽�����������ֵȫ��ת��Ϊint�ͣ�����ת�����ֵ���
public class NumberTrans {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		long d = 9223372036854775807L;
		System.out.println("����byte����������Ϊ"+a);
		System.out.println("������short��������Ϊ"+b);
		System.out.println("������int��������Ϊ"+c);
		System.out.println("������long��������Ϊ"+d);
		//�������н��Ǵӵ;���ת��Ϊ�߾��� 
		System.out.println("��a��ʾת��Ϊint��Ϊ"+(int)(a));
		System.out.println("��b��ʾת��Ϊint��Ϊ"+(int)(b));
		System.out.println("��c��ʾת��Ϊint��Ϊ"+(int)(c));
		
		//��һ���ǴӸ߾���ת��Ϊ�;��� �ʻ�������� �����Ϣ����
		System.out.println("��d��ʾת��Ϊint��Ϊ"+(int)(d));
	
	
	
	}

}
