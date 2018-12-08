import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Demo extends JFrame {
	private PrintThread printThread;
	
	public Demo() {
		//��ʼ������
		setVisible(true);
		setTitle("���Կ�");
		setBounds(200, 200, 200, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLayout(null);
		
		//��ʼ��ť
		JButton start = new JButton("��ʼ");
		start.setBounds(20	, 70, 60, 18);
		add(start);
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				printThread = new PrintThread(); //����һ����ӡ���߳�
				printThread.setDaemon(true);     //������Ϊ�ػ��߳�
				printThread.start();
			}
		});
		
		
		//������ť
		JButton end = new JButton("����");
		end.setBounds(100, 70, 60, 18);
		add(end);
		end.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				printThread.end();   //�����̵߳�run����
			}
		});
		
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Demo();
	}
}
