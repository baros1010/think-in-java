package unit21;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CloseResouce {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		ExecutorService exc = Executors.newCachedThreadPool();
		ServerSocket server = new ServerSocket(8080);
		InputStream socketInput = new Socket("localhost", 8080).getInputStream();
		exc.execute(new IOBlock(socketInput));
		exc.execute(new IOBlock(System.in));
		TimeUnit.SECONDS.sleep(1);
		System.out.println("shut down");
		exc.shutdownNow();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("close" + socketInput.getClass().getName());
		socketInput.close();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("close" + System.in.getClass().getName());
		System.in.close();

	}

}
