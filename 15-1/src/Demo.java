import java.awt.Container;
import java.io.*;
 
import javax.swing.*;
 
public class Demo {
	public static void main(String[] temp) {
				byte b[] = new byte[2];
		try{
			FileInputStream fileInputStream = new FileInputStream("word.txt");
			JFrame jf=new JFrame();
			jf.setLayout(null);
			Container container=jf.getContentPane();
			
			JTextArea jTextArea=new JTextArea();
			JScrollPane jScrollPane=new JScrollPane(jTextArea);
			jScrollPane.setBounds(0,0, 800,200); //���� jScrollPane��С
			container.add(jScrollPane);
			jf.setTitle("test");
			jf.setVisible(true);
			jf.setSize(800,200);
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			ProgressMonitorInputStream in = new ProgressMonitorInputStream(jf,"��ȡ�ļ�",fileInputStream);
		    while(in.read(b)!=-1){
			    String s = new String(b);
			    jTextArea.append(s);
			    Thread.sleep(100);//���ö�ȡ�ٶȣ�100����һ��
		    }
		 }catch (Exception e) {
			e.printStackTrace();
		 }
	}
}
