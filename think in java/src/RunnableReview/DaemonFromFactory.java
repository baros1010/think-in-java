package RunnableReview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable{

	@Override
	public void run() {
		while(true){
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				System.out.println(Thread.currentThread()+""+this);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		
	}
public static void main(String[] args) throws InterruptedException{
	ExecutorService exec=Executors.newCachedThreadPool(new DaemonThreadFactory());
	for(int i=0;i<10;i++)
	exec.execute(new DaemonFromFactory());
	System.out.println("start");
	TimeUnit.MILLISECONDS.sleep(5000);
}
}
