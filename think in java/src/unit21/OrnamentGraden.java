package unit21;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Count {
	private int count = 0;
	private Random rand = new Random(47);

	synchronized int increment() {
		int temp = count;
		if (rand.nextBoolean())
			Thread.yield();
		return (count = ++temp);
	}

	public synchronized int value() {
		return count;
	}
}

class Entrance implements Runnable {
	private static Count count = new Count();
	private static List<Entrance> entrance = new ArrayList<Entrance>();
	private int number = 0;
	private final int id;
	private static volatile boolean canceled = false;
	public Entrance(int id) {
		this.id = id;
		entrance.add(this);

	}

	public static void cancel() {
		canceled = true;
	}

	@Override
	public void run() {
		
		while (!canceled) {
			synchronized (this) {
				++number;
			}
			System.out.println(this + "Total:" + count.increment());
			try {
				TimeUnit.SECONDS.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("stop" + this);
	}

	public synchronized int getValue() {
		return number;
	}

	public String toString() {
		return "Entrance" + id + ":" + getValue();
	}

	public static int getToalCount() {
		return count.value();
	}

	public static int sumEntrances() {
		int sum = 0;
		for (Entrance ex : entrance)
			sum += ex.getValue();
		return sum;
	}

}

public class OrnamentGraden {
public static void main(String[] args) throws InterruptedException{
	ExecutorService exc=Executors.newCachedThreadPool();
	for(int i=0 ;i<50;i++)
		exc.execute(new Entrance(i));
	TimeUnit.SECONDS.sleep(3);
	Entrance.cancel();
	exc.shutdown();
	if(!exc.awaitTermination(250, TimeUnit.MILLISECONDS));
	System.out.println("aa");
	System.out.println("Total"+Entrance.getToalCount());
	System.out.println("Sum of Entrance"+Entrance.sumEntrances());
}
}
