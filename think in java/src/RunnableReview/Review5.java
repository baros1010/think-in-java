package RunnableReview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Review5 implements Runnable {

	public static void main(String[] args) {
		//ExecutorService exec=Executors.newCachedThreadPool();
		ExecutorService exec=Executors.newSingleThreadExecutor();
		for(int i=0;i<10;i++)
		exec.execute(new Review5());
	}

	@Override
	public void run() {
		System.out.println("delay 3 seconds");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println("lalal");
	}

}
