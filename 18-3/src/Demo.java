import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Demo  extends JFrame{
	
	public Demo() {
		// 初始化
		setVisible(true);
		setTitle("进度条");
		setBounds(200, 200, 300, 150);
		setLayout(null);
		
		//进度条
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
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					count++;
					if(count == 101)
						JOptionPane.showMessageDialog(null, "结束");
					}
				}
			
		});
		thread.start();
		add(jProgressBar);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Demo();
	}
}
