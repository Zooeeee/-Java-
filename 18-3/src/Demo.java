import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Demo  extends JFrame{
	
	public Demo() {
		// ��ʼ��
		setVisible(true);
		setTitle("������");
		setBounds(200, 200, 300, 150);
		setLayout(null);
		
		//������
		JProgressBar jProgressBar = new JProgressBar();
		jProgressBar.setBounds(0, 30, 300, 50);
		jProgressBar.setStringPainted(true);
		Thread thread = new Thread(new Runnable() {
			int count = 0 ;
			@Override
			public void run() {
				while (count <= 100) {
					jProgressBar.setValue(count);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					count++;
					if(count == 101)
						JOptionPane.showMessageDialog(null, "����");
					}
				}
			
		});
		thread.start();
		add(jProgressBar);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Demo();
	}
}
