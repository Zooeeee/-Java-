import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient {

	private Socket socket ; 
	
	public MyClient() {
		try {
			socket = new Socket("127.0.0.1", 8001);
			getInfo();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	private void getInfo() {
		try {
			BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String info = null ;
			while ((info = bufferedReader.readLine())!=null) {
				System.out.println(info);
			}
			bufferedReader.close();
			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new MyClient();
	}

}
