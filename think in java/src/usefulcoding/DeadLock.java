package usefulcoding;

public class DeadLock implements Runnable {
	private int count;
	private int flag = 1;
	private static Object o1 = new Object();
	private static Object o2 = new Object();

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		  DeadLock td1 = new DeadLock();  
	        DeadLock td2 = new DeadLock();  
	        td1.flag = 1;  
	        td2.flag = 0;  
	        //td1,td2都处于可执行状态，但JVM线程调度先执行哪个线程是不确定的。  
	        //td2的run()可能在td1的run()之前运行  
	        new Thread(td1).start();  
	        new Thread(td2).start(); 
		
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		if (flag == 1) {
			synchronized (o1) {
				try {
				count++;
				count++;
				if (count % 2 != 0) {
					System.out.println(count);
				} else {
					System.out.println("hello");
				}
				
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("1");
				}
			}
			
		}
		if (flag == 0) {

			synchronized (o2) {
				try {
				count++;
				count++;
				if (count % 2 != 0) {
					System.out.println(count);
				} else {
					System.out.println("hello");
				}
			
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("0");
				}
			}
			

		}

	}

}
