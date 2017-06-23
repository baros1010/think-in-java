package unit21;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class SleepBlocked implements Runnable {

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		try {
			TimeUnit.SECONDS.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		System.out.println("Exiting SleepBlocked.run()");
	}
}

class IOBlock implements Runnable {
	private InputStream in;

	public IOBlock(InputStream in) {
		this.in = in;
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("wait for read");
		try {
			in.read();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			if (Thread.currentThread().isInterrupted()) {
				System.out.println("Interrupted from block I/O");
			} else {
				throw new RuntimeException(e);
			}
		}
		System.out.println("ecit IOBlock.run()");
	}
}

class SynchronizedBlocked implements Runnable {
	public synchronized void f() {
		while (true)
			Thread.yield();
	}

	public SynchronizedBlocked() {
		new Thread() {
			public void run() {
				// TODO 自動生成されたメソッド・スタブ
				f();
			}
		}.start();

	}

	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("try to call f()");
		f();
		System.out.println("exiting synchronizedBlock.run()");
	}
}

public class Interrupting {
	public static ExecutorService exc = Executors.newCachedThreadPool();

	static void test(Runnable r) throws InterruptedException {
		Future<?> f = exc.submit(r);
		TimeUnit.MILLISECONDS.sleep(100);	
		
		f.cancel(true);
		System.out.println("Interrupt sent to "+r.getClass().getName());
		}
	public static void main(String args[]) throws InterruptedException{
		test(new SleepBlocked());
		test(new IOBlock(System.in));
		test(new SynchronizedBlocked());
		TimeUnit.SECONDS.sleep(3);
		System.out.println("aborting with System");
		System.exit(0);
	} 
}
