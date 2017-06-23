package unit12;

public class whocalled {
static void f(){
	try{
		throw new Exception();
	}catch(Exception e){
		for(StackTraceElement ste:e.getStackTrace())
			System.out.println(ste.getMethodName());
	}
}
static void g(){f();}
static void h(){g();}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		f();
		System.out.println("////////////////");
		g();
		System.out.println("////////////////");
		h();
	}

}
