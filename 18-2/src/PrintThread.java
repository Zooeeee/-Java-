
public class PrintThread extends Thread {
	private boolean flag = true ;
	private int count = 0  ;
	public void run() {
		flag = true ;
		System.out.println("�ҿ�ʼ��");
		while (flag) {
			System.out.println("���ǵ�"+count+"��");
			count++;
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
	public void end() {
		flag = false;
		System.out.println("�ҽ����ˣ����¼���");
	}
	
}
