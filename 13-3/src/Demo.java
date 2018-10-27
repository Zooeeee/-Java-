import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

//13-3

public class Demo extends JFrame{
	//一个是正确信息  一个是提交信息
	private String username = "mr";
	public String sub_username ;
	
	private String password = "mrsoft";
	public String sub_password ;
	
	public void creatFrame() {
		setTitle("13-3");
		setLayout(new FlowLayout(1,10,10));
		
		//用户名
		JLabel jLabel1 = new JLabel("账号 ：");
		add(jLabel1);
		JTextField jTextField = new JTextField("",12);
		add(jTextField);
			
		//密码
		JLabel jLabel2 = new JLabel("密码 ：");
		add(jLabel2);
		JPasswordField jPasswordField = new JPasswordField("",12);
		add(jPasswordField);
		
		
		//确认按钮 以及验证用户名  以及 密码的功能
		JButton submit = new JButton("确认");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sub_username = jTextField.getText();
				sub_password = jPasswordField.getText();
				if (sub_password.equals(password) && sub_username.equals(username))
				{
					new MyJdialog(Demo.this,"登陆成功").setVisible(true);
				}
				else
				{
					new MyJdialog(Demo.this,"登录失败").setVisible(true);
				}
			}
		});
		add(submit);
		
		
		//重置按钮
		JButton reset = new JButton("重置");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jTextField.setText("");
				jPasswordField.setText("");
			}
		});
		add(reset);
		
		
		
		setVisible(true);
		setSize(250,200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
					
	}
		
	

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.creatFrame();
		
	}
}


class MyJdialog extends JDialog{
	public MyJdialog(Demo demo ,String message) {
		super(demo,true);
		add(new JLabel(message));
		setBounds(120, 120, 100, 100);
	}
}
