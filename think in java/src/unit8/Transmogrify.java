package unit8;
class actor{

	 void act() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}
	
}
class Happyactor extends actor{
	void act(){
		System.out.println("happy");
	}
}
class sadactor extends actor{
	void act(){
		System.out.println("sad");
	}
}
class test{
	actor a=new Happyactor();
	void changge(){ a=new sadactor();}
	void ee(){a.act();}
}
public class Transmogrify {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		test t=new test();
		t.ee();
		t.changge();
		t.ee();
	}

}
