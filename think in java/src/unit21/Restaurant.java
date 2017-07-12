package unit21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Meal {
	private final int orderNum;

	public Meal(int orderNum) {
		this.orderNum = orderNum;
	}

	public String toString() {
		return "Meal" + orderNum;
	}
}

class waitPerson implements Runnable {
	private Restaurant restaurant;

	public waitPerson(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public void run() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try {
			while (!Thread.interrupted()) {
				synchronized (this) {
					while (restaurant.meal == null)
						wait();
				}
				System.out.println("Waitperson got" + restaurant.meal);
				synchronized (restaurant.cheif) {
					restaurant.meal = null;
					restaurant.cheif.notifyAll();
				}

			}
		} catch (InterruptedException e) {
			System.out.println("wait person");
		}
	}
}

class Cheif implements Runnable {
	private Restaurant restaurant;
	private int count;

	public Cheif(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public void run() {
		try {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			while (!Thread.interrupted()) {
				synchronized (this) {
					while (restaurant.meal != null)

						wait();
				}
				if(++count==10){
					System.out.println("out of food close");
					restaurant.exec.shutdownNow();
				}
				System.out.print("order up");
				synchronized (restaurant.waitperson){
					restaurant.meal=new Meal(count);
					restaurant.waitperson.notifyAll();
				}
				TimeUnit.MILLISECONDS.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO �����������ꂽ catch �u���b�N
			System.out.println("chef interput");
		}
	}
}

public class Restaurant {
	Meal meal;
	Cheif cheif=new Cheif(this);
	ExecutorService exec=Executors.newCachedThreadPool();
	waitPerson waitperson=new waitPerson(this);
	public Restaurant(){
		exec.execute(cheif);
		exec.execute(waitperson);
		
	}
	public static void main(String[] args){
		new Restaurant();
	}
	
}
