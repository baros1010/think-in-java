package unit3;

public class Equivalence {
	public static void main(String[] args) {
		Integer n = new Integer(11);
		Integer n1 = new Integer(11);
		System.out.println(n == n1);
		System.out.println(n != n1);
		System.out.println(n.equals(n1));
		int a=100;
		int b=a;
		System.out.println(a);
		System.out.println(b);
	}
}
