package unit5;
class Cup{
	Cup(int i){
		System.out.println(i);
	}
	 void f(int marker) {
		    System.out.println("f(" + marker + ")");
		  }
}

class Cups{
	static Cup cup1;
	static Cup cup2;
	static {
//		Cup cup1=new Cup(1);
//		Cup cup2=new Cup(2);
		 cup1=new Cup(1);
		 cup2=new Cup(2);
		
	}
	Cups(){
		System.out.println("cup()");
	}
}
public class ExplicitStatic {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		 System.out.println("Inside main()");
		  Cups.cup1.f(99); 
	}
	static Cups Cups1=new Cups();
	static Cups Cups2=new Cups();
	static Cups Cups3=new Cups();
	static Cups Cups4=new Cups();
	static Cups Cups5=new Cups();
}
