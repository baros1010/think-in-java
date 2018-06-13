package RunnableReview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class test1 implements Runnable {
	int pro;
	test1(int pro){
		this.pro=pro;
	}
	@Override
	public void run() {
		Thread.currentThread().setPriority(pro);
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		
	}
}

public class review1 {

	public static void main(String[] args) {
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<10;i++)
			exec.execute(new test1(Thread.MIN_PRIORITY));
			exec.execute(new test1(Thread.MAX_PRIORITY));
			exec.shutdown();
			
		
			
		
	}

}
