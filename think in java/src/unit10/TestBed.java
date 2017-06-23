package unit10;

public class TestBed {
	void f() {
		System.out.println("haha");
	}

	public static class Tester {
		public static void main(String[] args) {
			TestBed t = new TestBed();
			t.f();
		}
	}
}
