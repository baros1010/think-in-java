package unit21;

public class sleepyeid implements Runnable{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		sleepyeid sl=new sleepyeid();
		Thread td=new Thread(sl);
		td.start();
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("1");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			System.out.println("2");
		}
		
	}

}
