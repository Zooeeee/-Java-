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
	//"insert into tb_stu values('��ĳ','Ů,'1997-6-20')"
	public void add()  {
		try {
			sql = connection.prepareStatement("insert into tb_stu(name,sex,birthday) values(?,?,?)");
			 sql.setString(1, "��ĳ");
			 sql.setString(2, "Ů");
			 
			 //���ݿ��е����ձ���Ӧ����һ����������
			 //���ﱾ��Ӧ���� sql.setDate������
			 //�����Ҳ�������sql.Date����ʹ�÷���������ʹ���˲���׼ȷ���ַ���������date
			 sql.setString(3, "1999-10-20");
			 
			 sql.executeUpdate();
			System.out.println("�ɹ�д��");
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.add();
	}
	
	
}