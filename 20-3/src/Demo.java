import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Demo {
	Connection connection;
	PreparedStatement sql ;
	ResultSet res ;
	
	public Demo() {
		try {
			//�����õ������°�������������м���cj
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//���������test���ݿ��У������Ұ�װ��mysql�汾���ߣ�����ֺܶ�С����
			//�������Ϻ����ں��������Щ�޶������б����������
			this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test"
					+ "?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false", "root", "123456");
			System.out.println("�ɹ��������ݿ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//"delete from tb_stu where birthday < ?"
	public void delete()  {
		try {
			//������Ϊ����ҲӦ��ʹ��һ��Date���͵�����������
			//��String���Ͳ�֪���᲻�������ڴ�С�жϵĴ���
			sql = connection.prepareStatement("delete from tb_stu where birthday < ?");
			sql.setString(1, "2010-01-01");
			sql.executeUpdate();
			System.out.println("����ɾ�����");
		
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.delete();
	}
	
	
}