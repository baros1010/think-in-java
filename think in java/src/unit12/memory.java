package unit12;
class mm{
	public void test(){
		System.out.println("haha");
	}
}
public class memory extends mm{
	public void test(){
		System.out.println("xixi");
		super.test();
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		mm m=new memory(); 
		
		m.test();
	}

}
