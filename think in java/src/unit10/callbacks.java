package unit10;

interface Incrementable {
	void increment();
}

class Callee1 implements Incrementable {
	private int i = 0;

	@Override
	public void increment() {
		// TODO 自動生成されたメソッド・スタブ
		i++;
		System.out.println(i);
	}
}

class MyIncrement {
	public void increment() {
		System.out.println("///////");
	}

	static void f(MyIncrement mi) {
		mi.increment();
	}
}

class callee2 extends MyIncrement {
	private int i = 0;

	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}

	private class Closure implements Incrementable {

		@Override
		public void increment() {
			// TODO 自動生成されたメソッド・スタブ
			callee2.this.increment();
		}
	}
	Incrementable getCallbackReference(){
		return new Closure();
	}
}
class Caller{
	private Incrementable CallbackReference;
	Caller(Incrementable cbh){CallbackReference =cbh;}
	void go(){CallbackReference.increment();}
}
public class callbacks {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Callee1 c1=new Callee1();
callee2 c2=new callee2();
MyIncrement.f(c2);
Caller caller1=new Caller(c1);
Caller caller2=new Caller(c2.getCallbackReference());
caller1.go();
caller1.go();
caller2.go();
caller2.go();
	}

}
