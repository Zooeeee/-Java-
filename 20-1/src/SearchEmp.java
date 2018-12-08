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
			//这里用的是最新版的驱动，所有中间多个cj
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//这里的是在test数据库中，由于我安装的mysql版本过高，会出现很多小问题
			//查找资料后发现在后面加上这些限定不会有报错情况发生
			this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test"
					+ "?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false", "root", "123456");
			System.out.println("成功连接数据库");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void search() {
		try {
			this.sql = this.connection.createStatement();
			this.res = this.sql.executeQuery("select * from tb_emp where department = '销售部'");
			while (res.next()) {
				String name = res.getString("name");
				String id = res.getString("id");
				String department = res.getString("department");
				System.out.println("ID ："+ id +" 姓名 :"+name+" 部门 : "+department);
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SearchEmp searchEmp = new SearchEmp();
		searchEmp.search();
	}
	
	
}
