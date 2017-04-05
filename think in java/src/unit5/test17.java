package unit5;

public class test17 {
	String s;

	test17() {
		s = "hello";

		System.out.println(s);
	}
	public static void main(String[] args) {
		test17 t=new test17();
		char[] c=t.s.toCharArray();
		for(char cc:c){
			System.out.println(cc);
		}
	}
}
