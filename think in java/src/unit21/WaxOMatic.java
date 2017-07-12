package unit21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Car {
	private boolean waxOn = false;

	public synchronized void waxed() {
		waxOn = true;
		notifyAll();
	}

	public synchronized void buffed() {
		waxOn = false;
		notifyAll();
	}

	public synchronized void waitForWaxing() throws InterruptedException {
		while (waxOn == false)
			wait();
	}

	public synchronized void waitbuffing() throws InterruptedException {
		while (waxOn == true)
			wait();
	}
}

class WaxOn implements Runnable {
private Car car;
public WaxOn(Car car){
	this.car=car;
	
}
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
while(!Thread.interrupted()){
	
	try {
		System.out.print("Wax on! ");
		TimeUnit.MILLISECONDS.sleep(200);
		car.waxed();
		car.waitbuffing();
	} catch (InterruptedException e) {
		// TODO 自動生成された catch ブロック
		System.out.println("Exiting via interrupt");
	}
	System.out.println("ending wax on task");
}
	}
}
class WaxOff implements Runnable{

	private Car car;
	public WaxOff(Car car){
		this.car=car;
		
	}
		@Override
		public void run() {
			// TODO 自動生成されたメソッド・スタブ
	while(!Thread.interrupted()){
		
		try {
			car.waitForWaxing();
			System.out.print("Wax off!");
			TimeUnit.MILLISECONDS.sleep(200);
			car.buffed();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("Exiting via interrupt");
		}
		System.out.println("ending wax off task");
	}
		}
	
}
public class WaxOMatic {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		Car car =new Car();
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new WaxOff(car));
		exec.execute(new WaxOn(car));
		TimeUnit.SECONDS.sleep(5);
		exec.shutdown();
	}

}
