public class Demo extends Thread {
	public int count = 1  ;
	
	public void run() {
		while (this.count <= 100) {
			System.out.println("���ǵ�"+this.count+"�仰");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			this.count++;
		}
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Demo().start();
	}
}
