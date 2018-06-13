package RunnableReview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

abstract class getCount {
	private int count = 0;

	public abstract int count();
}
class count extends getCount{
int count=0;
	@Override
	public int count() {
		// TODO 自動生成されたメソッド・スタブ
		++count;
		++count;
		return count;
	}}


public class Review4  implements Runnable{
	getCount count;
	public Review4(getCount count){
		this.count=count;
	}
	public static void test(){
		//test(count);
	}
	public  void test(getCount count){
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new Review4(count));
	}
	@Override
	public void run() {
			while(true){
				int val =count.count();
				if(val%2==0){
					System.out.println(val+"aaaa");
					break;
				}
			}
	}
	public static void main(String[] args) {
	
			
	}

}
