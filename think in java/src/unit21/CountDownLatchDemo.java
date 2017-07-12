package unit21;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Taskportion implements Runnable {
	private static int counter = 0;
	private final int id = counter++;
	private final CountDownLatch latch;
	private static Random rand = new Random(47);

	public Taskportion(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		try {
			doWork();
			latch.countDown();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック

		}

	}

	public void doWork() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(rand.nextInt(2000));
		System.out.println(this + "copmlete");
	}

	public String toString() {
		return String.format("%1$-3d", id);
	}

}

class WaitingTask implements Runnable {
	private static int counter = 0;
	private final int id = counter++;
	private final CountDownLatch latch;

	public WaitingTask(CountDownLatch latch) {
		this.latch = latch;

	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		try {
			latch.await();
			System.out.println("latch barrier passed for" + this);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("interrupt" + this);
		}
	}

	public String toString() {
		return String.format("WaitingTask %1$-3d", id);
	}
}

/**
 * 首先WaitingTask 阻塞了3个线程让Taskportion 先执行 与此同时countDown 当记述值归零之后释放WaitingTask
 * 
 * @author firas
 *
 */
public class CountDownLatchDemo {
	private static final int SIZE = 5;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ExecutorService exec = Executors.newCachedThreadPool();
		CountDownLatch latch = new CountDownLatch(SIZE);
		for (int i = 0; i < 3; i++)
			exec.execute(new WaitingTask(latch));
		for (int i = 0; i < 10; i++)
			exec.execute(new Taskportion(latch));
		System.out.println("lanched all task");
		exec.shutdown();
	}

}
