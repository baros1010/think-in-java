package unit15;

public class   GenericMethods{
public <T> void f(T t){
	System.out.println(t.getClass().getName());
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		GenericMethods gen=new GenericMethods();
		gen.f("");
		gen.f(1);
		gen.f("1");
	}

}
