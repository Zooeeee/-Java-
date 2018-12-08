public class Demo extends Thread {
	public int count = 1  ;
	
	public void run() {
		while (this.count <= 100) {
			System.out.println("这是第"+this.count+"句话");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			this.count++;
		}
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Demo().start();
	}
}
