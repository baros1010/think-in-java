package unit5;

class Book {
	boolean checkOut = false;

	Book(boolean checkOut) {
		// checkOut = checkOut
		this.checkOut = checkOut;

	}

	void checkIn() {
		checkOut = false;

	}

	protected void finalize() {
		if (checkOut)
			System.out.println("error");
		// super.finalize();
	}

}

public class TerminationCondition {
	public static void main(String[] args) {
		Book b = new Book(true);
		b.checkIn();
		new Book(true);
		for (int i = 0; i < 500; i++) {
			System.out.println(i);
			if (i == 100) {
				System.gc();
			}
		}
	}
}
