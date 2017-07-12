package unit21;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Horse implements Runnable {
	private static int counter = 0;
	private final int id = counter++;
	private int strides = 0;
	private static Random rand = new Random(47);
	private static CyclicBarrier cyclicBarrier;

	public Horse(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	public synchronized int getStrides() {
		return strides;
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ

		try {
			
				while (!Thread.interrupted()) {
					synchronized (this) {
    					strides += rand.nextInt(3);
				}
				cyclicBarrier.await();
			}
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public String toString() {
		return "Horse" + id + " ";
	}

	public String tracks() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < getStrides(); i++) {
			s.append("*");

		}
		s.append(id);
		return s.toString();
	}

}

public class HorseRace {
	static final int FINISH_LINE = 75;
	private List<Horse> horses = new ArrayList<Horse>();
	private ExecutorService exec = Executors.newCachedThreadPool();
	private CyclicBarrier cyclicBarrier;

	public HorseRace(int nhorse, final int pause) {
		cyclicBarrier = new CyclicBarrier(nhorse, new Runnable() {
			public void run() {
				StringBuilder s = new StringBuilder();
				for (int i = 0; i < FINISH_LINE; i++)
					s.append("=");
				System.out.println(s);
				for (Horse horse : horses)
					System.out.println(horse.tracks());
				for (Horse horse : horses)
					if (horse.getStrides() >= FINISH_LINE) {
						System.out.println(horse + "won!");
						exec.shutdownNow();
						return;
					}
				try {
					TimeUnit.MILLISECONDS.sleep(pause);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					System.out.println("interupt");
				}

			}

		});
		for (int i = 0; i < nhorse; i++) {
			Horse horse = new Horse(cyclicBarrier);
			horses.add(horse);
			exec.execute(horse);
		}

	}

	public static void main(String[] args) {
		int nhorse = 7;
		int pause = 200;
		if (args.length > 0) {
			int n = new Integer(args[0]);
			nhorse = n > 0 ? n : nhorse; 

		}
		if (args.length > 1) {
			int p = new Integer(args[0]);
			pause = p > -1 ? p : pause;
		}
		new HorseRace(nhorse, pause);
	}
}
