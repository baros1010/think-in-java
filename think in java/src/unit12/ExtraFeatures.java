package unit12;
class MyException3 extends Exception{
	private int x;
	public MyException3(){}
	public MyException3(String msg){super(msg);}
	public MyException3(String msg,int x){
		super(msg);
		this.x=x;
	}
	public int val() {
		// TODO 自動生成されたメソッド・スタブ
		return x;
	}
}

public class ExtraFeatures {
	public static void f() throws MyException3{
		System.out.println("haha");
		throw new MyException3();
	}
	public static void g() throws MyException3{
		System.out.println("haha");
		throw new MyException3("pi");
	}
	public static void h() throws MyException3{
		System.out.println("haha");
		throw new MyException3("pi",47);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try{
			f();
		}catch(MyException3 e){
			e.printStackTrace(System.out);
		}
		try{
			g();
		}catch(MyException3 e){
			e.printStackTrace(System.out);
		}
		try{
			h();
		}catch(MyException3 e){
			e.printStackTrace(System.out);
			System.out.println(e.val());
		}
	}

}
