package test;

class Cleaner {
	private String s = "Cleaner";
	public Cleaner(){
		System.out.println("bbbbbb");
	}
	public void append(String a) {
		s += a;
	}

	public void f1() {
		append("f1()");
	}

	public void f2() {
		append("f2()");
	}

	public void f3() {
		append("f3()");
	}

	public String toString() {
		return s;
	}
	public static void main(String[] args) {
		Cleaner x=new Cleaner();
		x.f1();
		x.f2();
		x.f3();
		System.out.println(x);
	}
}

public class Detergent extends Cleaner{
	public Detergent(){
		System.out.println("aaaa");
	}
public void f3(){
	append("Detergent f3()");
	super.f3();
};
public void f4(){
	append("f4()");
}

	public static void main(String[] args) {
		Detergent x=new Detergent();
		x.f1();
		x.f2();
		x.f3();
		x.f4();
		System.out.println(x);
		System.out.println("////////");
		Cleaner.main(args);
	}

}