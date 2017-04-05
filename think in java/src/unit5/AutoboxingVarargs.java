package unit5;

public class AutoboxingVarargs {
	public static void f(Integer...args){
		for(Integer i:args){
			System.out.print(i);
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		f(1,2,3,4);
		f(new Integer(1),new Integer(2));
	}

}
