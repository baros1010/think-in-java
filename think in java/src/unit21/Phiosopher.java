package unit21;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Phiosopher implements Runnable {
	private Chopstick left;
	private Chopstick right;
	private final int id;
	private final int ponderFactor;
	private Random rand = new Random(47);

	private void pause() throws InterruptedException {
		if (ponderFactor == 0)
			return;
		TimeUnit.MILLISECONDS.sleep(rand.nextInt(ponderFactor * 250));
	}

	public Phiosopher(Chopstick left, Chopstick right, int id, int ponderFactor) {
		this.id = id;
		this.ponderFactor = ponderFactor;
		this.left = left;
		this.right = right;
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ

		try {
			while (!Thread.interrupted()) {
				System.out.println(this + " " + "think");
				pause();
				System.out.println(this + " " + "grabbing right");

				right.take();
				System.out.println(this + " " + "grabbing left");
				left.take();
				System.out.println(this + " " + "eat");
				pause();
				left.drop();
				System.out.println(this + " " + "release left");
				right.drop();
				System.out.println(this + " " + "release right");
			}

		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public String toString() {
		return "Philosopher" + id;
	}
}
