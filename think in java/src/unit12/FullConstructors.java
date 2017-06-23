package unit12;
	class MyException1 extends Exception{
		public MyException1(){
			
		}
		public MyException1(String msg){super(msg);}
	}
public class FullConstructors {
	public static void f()throws MyException1{
		System.out.println("throws f()");
		throw new MyException1();
	}
	public static void g() throws MyException1{
		System.out.println("throws g()");
		throw new MyException1("g()");
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try{
			f();
		}catch(MyException1 e){
			e.printStackTrace(System.out);
		}
		try{
			g();
		}catch(MyException1 e){
			e.printStackTrace(System.out);
		}
	}

}
