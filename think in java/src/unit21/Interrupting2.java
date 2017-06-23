package unit21;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BlockedMteux {
	private Lock lock = new ReentrantLock();

	public BlockedMteux() {
		lock.lock();
	}

	public void f() {
		try {
			lock.lockInterruptibly();
		} catch (InterruptedException e) {
			System.out.println("Interrupted from lock in f()");
		}
	}
}

class Blocked2 implements Runnable {
	BlockedMteux bm = new BlockedMteux();

	@Override
	public void run() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("wait for f()");
		bm.f();
		System.out.println("broken for f()");
	}

}

public class Interrupting2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Thread td=new Thread(new Blocked2());
		td.start();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Issuing td.interrupt();");
		td.interrupt();
		
	}

}
