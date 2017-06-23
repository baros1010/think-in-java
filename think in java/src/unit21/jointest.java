package unit21;

class T1 implements Runnable {

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ

		for (int i = 0; i < 100; i++) {
			System.out.println("lala" + i);
		
		}

	}
}




public class jointest implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		Thread td=new Thread(new jointest());
		td.start();
	
		Thread tds=new Thread(new T1 ());
		tds.start();
		tds.join(2000);
		

	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ

		for (int i = 0; i < 100; i++) {
			System.out.println("haha" + i);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}

	}

}
