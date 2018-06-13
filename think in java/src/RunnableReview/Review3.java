package RunnableReview;

class Sleeper extends Thread {
	private int duration;

	public Sleeper(String name, int duration) {
		super(name);
		this.duration = duration;
		start();
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			System.out.println(getName() + " was Interrupted" + "Interrupted() :" + isInterrupted());
		}
		System.out.println(getName() + " has awakened()");
	}
}

class Joiner extends Thread {
	private Sleeper sleeper;
	
	public Joiner(String name, Sleeper sleeper) {
		super(name);
		this.sleeper=sleeper;
		start();
	}
	public void run() {
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			System.out.println(getName() + " was Interrupted" + "Interrupted() :" + isInterrupted());
		}
		System.out.println(getName() + " has joined()");
	}
}

public class Review3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sleeper tom=new Sleeper("tom",1500);
		Joiner jerry=new Joiner("jerry",tom);
	}

}
