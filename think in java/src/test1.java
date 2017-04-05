public class test1 {
	private static int a;
	private int b;

	static {
		test1.a = 3;
		System.out.println(a);
		test1 t = new test1();
		t.f();
		t.b = 1000;
		System.out.println(t.b);
	}
	static {
		test1.a = 4;
		System.out.println(a);
		test1 aa=new test1();
		
	}

	public static void main(String[] args) {
		// TODO 自动生成方法存根
	}

	static {
		test1.a = 5;
		System.out.println(a);
	}

	public void f() {
		System.out.println("hhahhahah");
	}
}
