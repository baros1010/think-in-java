package unit15;

public class   GenericMethods{
public <T> void f(T t){
	System.out.println(t.getClass().getName());
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		GenericMethods gen=new GenericMethods();
		gen.f("");
		gen.f(1);
		gen.f("1");
	}

}
