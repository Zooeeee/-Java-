import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.lang.reflect.*;

//有时候运行时会出现swing组件渲染出错的问题
//就是一开始看不见 但是鼠标滑过之后就能显示

public class Demo extends JFrame {

	private String name ;
	private String password;
	
	public Demo() {
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("登录");
		setBounds(300,200,300,200);
		setLayout(null);
		
		//设置用户名
		JLabel jLabel = new JLabel("用户名：");
		jLabel.setBounds(10,10,200,18);
		JTextField jName = new JTextField();
		jName.setBounds(80,10,150,18);
		add(jLabel);
		add(jName);
		
		//设置密码
		JLabel jLabel2 = new JLabel("密码：");
		jLabel2.setBounds(10,50,200,18);
		JTextField jPassword = new JTextField();
		jPassword.setBounds(80,50,150,18);
		add(jLabel2);
		add(jPassword);
		
		//确认按钮
		JButton jButton = new JButton("确认");
		jButton.setBounds(80, 80, 60, 18);
		add(jButton);
		jButton.addActionListener(new ActionListener() {//增加监听事件
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//设置获取的string成为Demo类的一个私有属性
				setName(jName.getText());
			    setPassword(jPassword.getText());
			    Field[] fields = Demo.class.getDeclaredFields(); // 通过Java反射机制获得类中的所有属性
			    String[] result = {"",""};
			    for (int i = 0; i < fields.length; i++) {
			    	Field field = fields[i];
					field.setAccessible(true);                    //设置private属性可见
					try {
						System.out.println(field.get(Demo.this));  //获取Demo类中本例的属性
						result[i] = (String)field.get(Demo.this);
					} catch (IllegalArgumentException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
				JOptionPane.showMessageDialog(null, "用户名："+result[0]+"\n密码："+result[1]);
			}
		});
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Demo();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


}
