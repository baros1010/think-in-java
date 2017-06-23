package unit12;

public class Rethowing {
public static void f() throws Exception{
	System.out.println("originating the exception in f()");
	throw new Exception("throw from f()");
}
public static void g() throws Exception{
	try{
		f();
	}catch(Exception e){
		System.out.println("inside g() e.printStackTrace");
		e.printStackTrace(System.out);
		throw e;
	}
	
}
public static void h() throws Exception{
	try{
		f();
	}catch(Exception e){
		System.out.println("inside h() e.printStackTrace");
		e.printStackTrace(System.out);
		throw (Exception)e.fillInStackTrace();
	}
	
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try{
			g();
		}catch(Exception e){
			System.out.println("main printStackTrace");
			e.printStackTrace(System.out);
		}
		try{
			h();
		}catch(Exception e){
			System.out.println("main printStackTrace");
			e.printStackTrace(System.out);	
		}
	}

}
