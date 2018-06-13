package RunnableReview;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NaviException2 implements Runnable{
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
			ExecutorService exec=Executors.newCachedThreadPool();
			exec.execute(new NaviException2());
		

	}
	class Handler implements UncaughtExceptionHandler{

		@Override
		public void uncaughtException(Thread t, Throwable e) {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println(e);
			
		}}
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		t.setUncaughtExceptionHandler(new Handler());
		System.out.println(t.getUncaughtExceptionHandler());
		throw new RuntimeException();
		
	}

}
