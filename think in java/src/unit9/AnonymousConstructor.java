package unit9;
abstract class Base{
	public Base(int i){
		System.out.println("Base constructor i="+i);
	}
	public abstract void f();
}
public class AnonymousConstructor {
public static Base getBase(int i){
	return new Base(i){
		{System.out.println("Inside instance initializer");}
		@Override
		public void f() {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("In anonymous f()");
		}
	
	};
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Base base =getBase(47);
		base.f();
	}

}
