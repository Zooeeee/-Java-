// 12-2
public class Number  {
	public static int count (int value1 ,int value2) throws Exception{
		return value1*value2;
	}

	public static void main(String[] args) {
		//Number.count(9999999,99999999));
		//������䲻��try������ ���Գ����޷���������ִ��
		try {
			System.out.println(Number.count(9999999,99999999));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
