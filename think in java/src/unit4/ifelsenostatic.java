package unit4;

public class ifelsenostatic {
	int a = 1;

	void test(int test1, int test2) {
		if (test1 > test2) {

			a = 1;

		} else if (test1 == test2) {

			a = 0;

		} else {
			a = -1;
		}
	}

	public static void main(String[] args) {
		ifelsenostatic is=new ifelsenostatic();
		is.test(1, 2);
		System.out.println(is.a);
		is.test(2, 2);
		System.out.println(is.a);
		is.test(3, 2);
		System.out.println(is.a);
	}
}
