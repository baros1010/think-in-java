package RunnableReview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread implements Runnable{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
ExecutorService exec=Executors.newCachedThreadPool();
exec.execute(new ExceptionThread());
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		throw new RuntimeException();
	}

}
