import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Demo extends JFrame {
	private PrintThread printThread;
	
	public Demo() {
		//初始化设置
		setVisible(true);
		setTitle("测试框");
		setBounds(200, 200, 200, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLayout(null);
		
		//开始按钮
		JButton start = new JButton("开始");
		start.setBounds(20	, 70, 60, 18);
		add(start);
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				printThread = new PrintThread(); //创建一个打印的线程
				printThread.setDaemon(true);     //设置其为守护线程
				printThread.start();
			}
		});
		
		
		//结束按钮
		JButton end = new JButton("结束");
		end.setBounds(100, 70, 60, 18);
		add(end);
		end.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				printThread.end();   //结束线程的run方法
			}
		});
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Demo();
	}
}
