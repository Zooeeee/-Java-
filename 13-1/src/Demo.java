import javax.swing.*;
import java.awt.*;


//14-1
public class Demo extends JFrame {
	
	public void CreateJframe(String title) {
		JFrame jf = new JFrame(title);
		Container container = jf.getContentPane(); 
		container.setLayout(null);
       

		//下拉列表框
        String[] listData = new String[]{"红","黄","蓝"};
        JComboBox<String> comboBox = new JComboBox<String>(listData);
        comboBox.setBounds(0,0,280,20);
       	container.add(comboBox);
        
       //复选框男
        JCheckBox checkBox1 = new JCheckBox("男");
        checkBox1.setBounds(80,30,50,20);
        container.add(checkBox1);
        
        //复选框女
        JCheckBox checkBox2 = new JCheckBox("女");
        checkBox2.setBounds(130,30,50,20);
        container.add(checkBox2);
        
        
        //确认
    	JButton jButton1 = new JButton("确认");
    	jButton1.setBounds(40,60,70,30);
        container.add(jButton1);
        
        //取消
        JButton jButton2 = new JButton("取消");
    	jButton2.setBounds(150,60,70,30);
        container.add(jButton2);
        
        
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(300,200);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	}	
	
	
	public static void main(String[] args) {
		new Demo().CreateJframe("13-1");

	}

}
