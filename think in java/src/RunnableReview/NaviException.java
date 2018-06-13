package RunnableReview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NaviException {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread());

		} catch (Exception e) {
			System.out.println("error");
		}
	}

}
