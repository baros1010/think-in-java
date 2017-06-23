package unit21;

class Sleeper extends Thread {
	private int duration;

	public Sleeper(String name, int sleepTime) {
		super(name);
		duration = sleepTime;
		start();
	}

	public void run() {
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			System.out.println(getName() + "was interrupted" + "is interrupted" + isInterrupted());
			return;
		}
		System.out.println(getName() + "wake");
	}
}

class Joiner extends Thread {
	private Sleeper sleeper;

	public Joiner(String name, Sleeper sleeper) {
		super(name);
		this.sleeper = sleeper;
		start();
	}

	public void run() {
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println(getName() + "joined");
	}
}

public class Joining {
	public static void main(String[] args) {
		Sleeper sleepy = new Sleeper("Sleepy", 1500), grumpy = new Sleeper("Grumpy", 1500);
		Joiner dopey = new Joiner("dopey", sleepy), doc = new Joiner("doc", grumpy);
		grumpy.interrupt();
	}
}
