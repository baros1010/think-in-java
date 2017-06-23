package unit21;

public class interrupt2 implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		Thread td=new Thread(new interrupt2());
		td.start();
		//td.sleep(1000);
		Thread.sleep(1000);
		   System.out.println("****************************");  
	        System.out.println("Interrupted Thread!");  
	        System.out.println("****************************");  
	        td.interrupt();  
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<100;i++)
			System.out.println("id"+i);
	}

}
