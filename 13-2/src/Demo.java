import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Demo extends JFrame {
	public void createJframe() {
		setTitle("13-2");
		
		setLayout(new FlowLayout(1, 10, 10));//流式布局 居中显示
		
		//定义一个数组
		String[] listData = {"1","2","3","4","5","6","7","8"};
		//下拉列表
		JComboBox<String> jComboBox = new JComboBox<String>();
		add(jComboBox);
		
		//按钮以及事件
		JButton jButton = new JButton("添加一个下拉列表框");
		jButton.addActionListener(new ActionListener() {
			int count = 0 ;
			public void actionPerformed(ActionEvent e) {
				jComboBox.addItem("这是第"+listData[count]+"个下拉列表");
				count++;
			}
		});
		add(jButton);
		
				
		//窗体设置
		setSize(200, 150);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Demo().createJframe();
	}
}
