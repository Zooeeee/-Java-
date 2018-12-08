import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread implements Runnable {
	private Socket s ;
	BufferedReader br = null;
	public ClientThread(Socket s) {
		try {
			this.s = s ;
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		try {
			String content = null ;
			while((content = br.readLine())!=null) {
				System.out.println(content);
			}
			
		} catch (Exception e) {
		}

	}
}
