package unit15;
class Other{}
class BasicOther extends BasicHolder<Other>{}

public class Unconstrained {
	
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		BasicOther b=new BasicOther(),b2=new BasicOther();
		b.set(new Other());
		Other o=b.get();
		b.f();
	}

}
