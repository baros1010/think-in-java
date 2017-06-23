package unit21;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskWithResult implements Callable<String> {
	private int id;

	public TaskWithResult(int id) {
		this.id = id;

	}

	@Override
	public String call() throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return " id=" + id;
	}

}

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO 自動生成されたメソッド・スタブ
		ExecutorService exc=Executors.newCachedThreadPool();
		ArrayList<Future<String>> results=new ArrayList<Future<String>>();
		for(int i=0;i<10;i++)
			results.add(exc.submit(new TaskWithResult(i)));
		for(Future<String> s:results)
			System.out.println(s.get());
		exc.shutdown();
	}

}
