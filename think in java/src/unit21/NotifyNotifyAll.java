package unit21;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Blocker {
	synchronized void waitingCall() {
		try {
			while (!Thread.interrupted()) {

				wait();
				System.out.println(Thread.currentThread() + " ");
			}

		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			
		}
	}

	synchronized void prod() {
		notify();
	}

	synchronized void prodAll() {
		notifyAll();
	}
}

class Task implements Runnable {
	static Blocker blocker = new Blocker();

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		blocker.waitingCall();
	}
}

class Task2 implements Runnable {
	static Blocker blocker = new Blocker();

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		blocker.waitingCall();
	}
}

public class NotifyNotifyAll {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new Task());
		exec.execute(new Task2());
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			boolean prod = true;

			@Override
			public void run() {
				// TODO 自動生成されたメソッド・スタブ
				if (prod) {
					System.out.println("\nnotify");
					Task.blocker.prod();
					prod = false;
				} else {
					System.out.println("\nnotifyAll");
					Task.blocker.prodAll();
					prod = true;
				}
			}

		}, 400, 400);
		TimeUnit.SECONDS.sleep(5);
		timer.cancel();
		System.out.println("\nTimer canceled");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("\nshut down");
		exec.shutdownNow();
		
	}

}
