package unit15;
interface FactoryI<T>{
	T create();
}
class Foo2<T>{
	private T x;
	public <F extends FactoryI<T>> Foo2(F f){
		x=f.create();
		
	}
}
class IntegerFactory implements FactoryI<Integer>{

	@Override
	public Integer create() {
		// TODO 自動生成されたメソッド・スタブ
		return new Integer(0);
	}
	
}
class Widget{
	public static   class  Factory implements FactoryI<Widget>{

		@Override
		public Widget create() {
			// TODO 自動生成されたメソッド・スタブ
			return new Widget();
		}}
	
}
public class FactoryConstraint {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Foo2<Integer>(new IntegerFactory());
		new Foo2<Widget>(new Widget.Factory());
	}

}
