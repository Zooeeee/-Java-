import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Demo extends JFrame {
	public void createJframe() {
		setTitle("13-2");
		
		setLayout(new FlowLayout(1, 10, 10));//��ʽ���� ������ʾ
		
		//����һ������
		String[] listData = {"1","2","3","4","5","6","7","8"};
		//�����б�
		JComboBox<String> jComboBox = new JComboBox<String>();
		add(jComboBox);
		
		//��ť�Լ��¼�
		JButton jButton = new JButton("���һ�������б��");
		jButton.addActionListener(new ActionListener() {
			int count = 0 ;
			public void actionPerformed(ActionEvent e) {
				jComboBox.addItem("���ǵ�"+listData[count]+"�������б�");
				count++;
			}
		});
		add(jButton);
		
				
		//��������
		setSize(200, 150);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Demo().createJframe();
	}
}
