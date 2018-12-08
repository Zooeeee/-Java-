
public class PrintThread extends Thread {
	private boolean flag = true ;
	private int count = 0  ;
	public void run() {
		flag = true ;
		System.out.println("我开始了");
		while (flag) {
			System.out.println("这是第"+count+"次");
			count++;
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	public void end() {
		flag = false;
		System.out.println("我结束了，重新计数");
	}
	
}
