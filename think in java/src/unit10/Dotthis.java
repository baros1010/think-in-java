package unit10;

public class Dotthis {
	void f(){System.out.println("DontThis.f()");}
	public class Inner{
		public Dotthis outer(){
			return Dotthis.this;
		}
	}
	public Inner inner(){return new Inner();}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Dotthis dt=new Dotthis();
		Dotthis.Inner dti=dt.inner();
		dti.outer().f();
	}

}
