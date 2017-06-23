package unit21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class CircularSet {
	private int[] array;
	private int len;
	private int index;

	public CircularSet(int size) {
		array = new int[size];
		len = size;
		for (int i = 0; i < size; i++)
			array[i] = -1;

	}

	public synchronized void add(int i) {
		array[index] = i;
		index = ++index % len;

	}

	public synchronized boolean contains(int val) {
		for (int i = 0; i < len; i++)
			if (array[i] == val)
				return true;
		return false;
	}
}

public class SerialNumberCheck {
	private static final int SIZE = 10;
	private static CircularSet serials = new CircularSet(1000);
	private static ExecutorService exc = Executors.newCachedThreadPool();
	
	static class SerialChecker implements Runnable {

		@Override
		public void run() {
			// TODO 自動生成されたメソッド・スタブ
			while (true) {
				int serial = SerialNumberGenerator.nextSerialNumber();
				if (serials.contains(serial)) {
					System.out.println("Dulicate" + serial);
					System.exit(0);
				}
				serials.add(serial);
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<SIZE;i++)
			exc.execute(new SerialChecker());
			if(args.length>0){
				TimeUnit.SECONDS.sleep(new Integer(args[0]));
				System.out.println("haha");
				System.exit(0);
			}
				
	}

}
