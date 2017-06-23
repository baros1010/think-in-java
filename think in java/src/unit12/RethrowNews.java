package unit12;
class OneException extends Exception{
	public OneException(String s){super(s);}
}
class TwoException extends Exception{
	public TwoException(String s){super(s);}
}
public class RethrowNews {
	public static void f() throws OneException{
		System.out.println("orinating the exception in f()");
		throw new OneException("thrown from f()");
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try{
			try{
				f();
			}catch(OneException e){
				System.out.println("Caught inner try,e.printStackTrace()");
				e.printStackTrace(System.out);
				throw new TwoException("haha");
			}
		}catch(TwoException e){
			System.out.println("Caught outer try,e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}

}
