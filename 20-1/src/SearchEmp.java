import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SearchEmp {
	Connection connection;
	Statement sql ;
	ResultSet res ;
	
	public SearchEmp() {
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
	
	public void search() {
		try {
			this.sql = this.connection.createStatement();
			this.res = this.sql.executeQuery("select * from tb_emp where department = '���۲�'");
			while (res.next()) {
				String name = res.getString("name");
				String id = res.getString("id");
				String department = res.getString("department");
				System.out.println("ID ��"+ id +" ���� :"+name+" ���� : "+department);
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SearchEmp searchEmp = new SearchEmp();
		searchEmp.search();
	}
	
	
}
