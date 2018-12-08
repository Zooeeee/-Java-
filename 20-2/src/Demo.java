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
	//"insert into tb_stu values('李某','女,'1997-6-20')"
	public void add()  {
		try {
			sql = connection.prepareStatement("insert into tb_stu(name,sex,birthday) values(?,?,?)");
			 sql.setString(1, "李某");
			 sql.setString(2, "女");
			 
			 //数据库中的生日本来应该是一个日期类型
			 //这里本来应该是 sql.setDate方法的
			 //但是找不到对于sql.Date包的使用方法，于是使用了不够准确的字符串来描述date
			 sql.setString(3, "1999-10-20");
			 
			 sql.executeUpdate();
			System.out.println("成功写入");
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.add();
	}
	
	
}