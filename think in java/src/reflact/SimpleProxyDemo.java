package reflact;

interface Interface {
	void doSthing();

	void somethingElse(String arg);
}

class RealObject implements Interface {

	@Override
	public void doSthing() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("doSthing");
	}

	@Override
	public void somethingElse(String arg) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("somethingElse" + arg);
	}
}

class SimpleProxy implements Interface {
	private Interface proxied;

	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;

	}

	@Override
	public void doSthing() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("SimpleProxy doSthing");
		proxied.doSthing();
	}

	@Override
	public void somethingElse(String arg) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("SimpleProxy somethingElse" + arg);
		proxied.somethingElse(arg);
	}
}

public class SimpleProxyDemo {
	public static void consumer(Interface inter){
		inter.doSthing();
		inter.somethingElse("bobo");
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}

}
