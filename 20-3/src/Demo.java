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
	//"delete from tb_stu where birthday < ?"
	public void delete()  {
		try {
			//个人认为这里也应该使用一个Date类型的来描述生日
			//用String类型不知道会不会有日期大小判断的错误
			sql = connection.prepareStatement("delete from tb_stu where birthday < ?");
			sql.setString(1, "2010-01-01");
			sql.executeUpdate();
			System.out.println("数据删除完毕");
		
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.delete();
	}
	
	
}