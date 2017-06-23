package unit21;

public class MultiLock {
	public synchronized void f1(int count) {
		if (count--> 0){
			System.out.println("f1() call f2()with count" + count);
			f2(count);
	
		}
		
	}

	public synchronized void f2(int count) {
		// TODO 自動生成されたメソッド・スタブ
		if (count--> 0){
			System.out.println("f2() call f1()with count" + count);
			f1(count);
	
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final MultiLock m = new MultiLock();
		new Thread() {
			public void run() {
				m.f1(10);
			}
		}.start();

	}

}
