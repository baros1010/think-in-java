package unit7;
class game{
	game(int i){
		System.out.println("aa");
		
	}
}

public class Chess extends game{
	/**
	 * 无法通过编译
	 * super关键字使用调用基类
	 */
//	Chess(){
//		
//		System.out.println("22");
//}
	Chess(){
		super(1);
		System.out.println("22");
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Chess c=new Chess();
	}

}
