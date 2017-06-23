package unit21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Access implements Runnable{
	private final int id;
	public Access(int id){
		this.id=id;
	}
	
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		while(!Thread.currentThread().isInterrupted()){
			ThreadLocalVariableHolder.increment();
			System.out.println(this);
			Thread.yield();
		}
		
	}
	public String toString(){
		return "#"+id+":"+ThreadLocalVariableHolder.get();
	} 
}
public class ThreadLocalVariableHolder {
	public static ThreadLocal<Integer>value=new ThreadLocal<Integer>(){
		private Random rand=new Random(47);
		protected synchronized Integer initialValue(){
			return rand.nextInt(10000);
		}
		
	};
	public static void increment(){
		value.set(value.get()+1);
	}
	public static int get(){return value.get();}
	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		ExecutorService exc=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
			exc.execute(new Access(i));
		TimeUnit.SECONDS.sleep(10);
		exc.shutdownNow();
	}
}
