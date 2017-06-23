package unit21;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<10;i++){
			 Thread tds = new Thread(new SimpleDaemons());
			 tds.setDaemon(true);
			 tds.start();
		}
		System.out.println("a");
		TimeUnit.MILLISECONDS.sleep(200);
			
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		try{
			while(true){
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread()+" "+this);
			}
			
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
	}

}
