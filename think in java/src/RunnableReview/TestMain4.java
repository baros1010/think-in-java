package RunnableReview;

import java.io.IOException;

public class TestMain4 implements Runnable {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Thread test = new Thread(new TestMain4());
		test.setDaemon(true);
		test.start();
		System.out.println("isDaemon = " + test.isDaemon());
		try {
			System.in.read();

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				
				System.out.println(i);
			}
			
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			System.out.println(".......");
		}

	}

}
