package unit10;

public class Outer {
class Inner{
	Inner(){
		System.out.println("hahaha");
	}
}
Inner test(){
	return new Inner();
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Outer o=new Outer();
Outer.Inner i=o.test();
Outer.Inner is=o.new Inner();
	}

}
