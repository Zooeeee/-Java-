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
	//һ������ȷ��Ϣ  һ�����ύ��Ϣ
	private String username = "mr";
	public String sub_username ;
	
	private String password = "mrsoft";
	public String sub_password ;
	
	public void creatFrame() {
		setTitle("13-3");
		setLayout(new FlowLayout(1,10,10));
		
		//�û���
		JLabel jLabel1 = new JLabel("�˺� ��");
		add(jLabel1);
		JTextField jTextField = new JTextField("",12);
		add(jTextField);
			
		//����
		JLabel jLabel2 = new JLabel("���� ��");
		add(jLabel2);
		JPasswordField jPasswordField = new JPasswordField("",12);
		add(jPasswordField);
		
		
		//ȷ�ϰ�ť �Լ���֤�û���  �Լ� ����Ĺ���
		JButton submit = new JButton("ȷ��");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sub_username = jTextField.getText();
				sub_password = jPasswordField.getText();
				if (sub_password.equals(password) && sub_username.equals(username))
				{
					new MyJdialog(Demo.this,"��½�ɹ�").setVisible(true);
				}
				else
				{
					new MyJdialog(Demo.this,"��¼ʧ��").setVisible(true);
				}
			}
		});
		add(submit);
		
		
		//���ð�ť
		JButton reset = new JButton("����");
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
