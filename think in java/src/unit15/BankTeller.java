package unit15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

class Customer {
	private static long counter = 1;
	private final long id = counter++;

	public String toString() {
		return "Customer" + id;
	}

	public static Generator<Customer> generator() {
		return new Generator<Customer>() {

			@Override
			public Customer next() {
				// TODO 自動生成されたメソッド・スタブ
				return new Customer();
			}

		};
	}
}

class Teller {
	private static long counter = 1;
	private final long id = counter++;

	public String toString() {
		return "Teller" + id;
	}

	public static Generator<Teller> generator() {
		return new Generator<Teller>() {

			@Override
			public Teller next() {
				// TODO 自動生成されたメソッド・スタブ
				return new Teller();
			}
		};
	}
}

public class BankTeller {
	public static void serve(Teller t,Customer c){
		System.out.println(t+" "+c);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand=new Random(47);
		Queue<Customer> line=new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);
		List<Teller> list=new ArrayList<Teller>();
		Generators.fill(list, Teller.generator(), 14);
		for(Customer c:line)
			serve(list.get(rand.nextInt(list.size())),c);
	}

}
