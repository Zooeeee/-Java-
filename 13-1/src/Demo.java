import javax.swing.*;
import java.awt.*;


//14-1
public class Demo extends JFrame {
	
	public void CreateJframe(String title) {
		JFrame jf = new JFrame(title);
		Container container = jf.getContentPane(); 
		container.setLayout(null);
       

		//�����б��
        String[] listData = new String[]{"��","��","��"};
        JComboBox<String> comboBox = new JComboBox<String>(listData);
        comboBox.setBounds(0,0,280,20);
       	container.add(comboBox);
        
       //��ѡ����
        JCheckBox checkBox1 = new JCheckBox("��");
        checkBox1.setBounds(80,30,50,20);
        container.add(checkBox1);
        
        //��ѡ��Ů
        JCheckBox checkBox2 = new JCheckBox("Ů");
        checkBox2.setBounds(130,30,50,20);
        container.add(checkBox2);
        
        
        //ȷ��
    	JButton jButton1 = new JButton("ȷ��");
    	jButton1.setBounds(40,60,70,30);
        container.add(jButton1);
        
        //ȡ��
        JButton jButton2 = new JButton("ȡ��");
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
