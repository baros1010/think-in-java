package unit8;
class Derived extends PrivateOverride{
	public void f(){
		System.out.println("aaa");
	}
}
public class PrivateOverride {
	private void f(){
		System.out.println("bbb");
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		PrivateOverride p=new Derived();
		p.f();
	}

}
