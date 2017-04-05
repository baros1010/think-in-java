package unit5;

public class test22 {
	coin c;

	test22(coin c) {
		this.c = c;
	}

	void test() {

		switch (c) {
		case eu:
			System.out.println(1);
			break;
		case us:
			System.out.println(1);
			break;
		case cn:
			System.out.println(1);
			break;
		case jp:
			System.out.println(1);
			break;

		}
	}

	public static void main(String[] args) {
		test22 t = new test22(coin.eu);
		t.test();

	}
}
