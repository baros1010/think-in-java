package unit21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities implements Runnable {
	private int countDown = 5;
	private volatile double d;
	private int priority;

	public SimplePriorities(int priority) {
		this.priority=priority;
	}
	public String toString(){
		return Thread.currentThread()+":"+countDown;
	}
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		Thread.currentThread().setPriority(priority);
		while(true){
			for(int i=1;i<10000;i++)
			{
				d+=(Math.PI+Math.E)/(double)i;
				if(i%1000==0)
					Thread.yield();
			}
			System.out.println(this);
			if(--countDown==0)
				return;
		}

	}
	public static void main(String[] args){
		ExecutorService ex=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
			ex.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		ex.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		ex.shutdown();
	}
}
