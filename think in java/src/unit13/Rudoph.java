package unit13;

public class Rudoph {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(String pattern:new String[]{"Rudoph","[Rr]Rudoph","[Rr] [aeiou] [a-z]ol.*","R.*"})
		System.out.println("Rudoph".matches(pattern));
	}

}
