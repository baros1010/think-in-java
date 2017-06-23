package unit13;

public class SimpleFormat {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x=5;
		double a=2.13;
		System.out.println("["+x+" "+a+"]");
		System.out.printf("[%d %f]\n", x,a);
		System.out.format("[%d %f]\n", x,a);
		
	}

}
