package RunnableReview;

import java.io.IOException;

class test2 implements Runnable{

	@Override
	public void run() {
	
		
		System.out.println("start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally{
			System.out.println("finally");
		}
		
	}
	
}
public class review2 {
public static void main(String[] args) throws IOException{
	Thread th=new Thread(new test2());
	th.setDaemon(true);
	th.start();
	System.in.read();
}
}
