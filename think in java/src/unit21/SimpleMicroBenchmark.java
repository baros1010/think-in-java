package unit21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

abstract class Incrementable {
	protected long counter = 0;

	public abstract void increment();
}

class SynchronizedTest extends Incrementable {

	@Override
	public synchronized void increment() {
		// TODO 自動生成されたメソッド・スタブ
		++counter;
	}
}

class LockingTest extends Incrementable {
	private Lock lock = new ReentrantLock();

	@Override
	public void increment() {
		// TODO 自動生成されたメソッド・スタブ
		lock.lock();
		try {
			++counter;
		} finally {
			lock.unlock();
		}
	}
}

public class SimpleMicroBenchmark {
	static long test(Incrementable incr) {
		long start = System.nanoTime();
		for (int i = 0; i < 10000000L; i++)
			incr.increment();
		return System.nanoTime() - start;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long syn = test(new SynchronizedTest());
		long lock = test(new LockingTest());
		System.out.printf("syn: %1$10d\n", syn);
		System.out.printf("lock: %1$10d\n", lock);
		System.out.println(syn/lock);
	}

}
