package unit15;

public class   GenericMethods{
public <S,K,T> void f(S s,K k,T t){
	System.out.println(s.getClass().getName()+k.getClass().getName()+t.getClass().getName());
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		GenericMethods gen=new GenericMethods();
		gen.f("",1,1.0);
		gen.f(1,"1",' ');

	}

}
