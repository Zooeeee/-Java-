import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.lang.reflect.*;

//��ʱ������ʱ�����swing�����Ⱦ���������
//����һ��ʼ������ ������껬��֮�������ʾ

public class Demo extends JFrame {

	private String name ;
	private String password;
	
	public Demo() {
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("��¼");
		setBounds(300,200,300,200);
		setLayout(null);
		
		//�����û���
		JLabel jLabel = new JLabel("�û�����");
		jLabel.setBounds(10,10,200,18);
		JTextField jName = new JTextField();
		jName.setBounds(80,10,150,18);
		add(jLabel);
		add(jName);
		
		//��������
		JLabel jLabel2 = new JLabel("���룺");
		jLabel2.setBounds(10,50,200,18);
		JTextField jPassword = new JTextField();
		jPassword.setBounds(80,50,150,18);
		add(jLabel2);
		add(jPassword);
		
		//ȷ�ϰ�ť
		JButton jButton = new JButton("ȷ��");
		jButton.setBounds(80, 80, 60, 18);
		add(jButton);
		jButton.addActionListener(new ActionListener() {//���Ӽ����¼�
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//���û�ȡ��string��ΪDemo���һ��˽������
				setName(jName.getText());
			    setPassword(jPassword.getText());
			    Field[] fields = Demo.class.getDeclaredFields(); // ͨ��Java������ƻ�����е���������
			    String[] result = {"",""};
			    for (int i = 0; i < fields.length; i++) {
			    	Field field = fields[i];
					field.setAccessible(true);                    //����private���Կɼ�
					try {
						System.out.println(field.get(Demo.this));  //��ȡDemo���б���������
						result[i] = (String)field.get(Demo.this);
					} catch (IllegalArgumentException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
				JOptionPane.showMessageDialog(null, "�û�����"+result[0]+"\n���룺"+result[1]);
			}
		});
	}
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
