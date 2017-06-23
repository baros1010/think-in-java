package unit9;
interface Cycle {
	void method1();

}

interface CycleFactory {
	Cycle getFactory();
}

class Unicycle implements Cycle {

	@Override
	public void method1() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("OFO");
	}
}

class UnicycleFactory implements CycleFactory {

	@Override
	public Cycle getFactory() {
		// TODO 自動生成されたメソッド・スタブ
		return new Unicycle();
	}
}

class Bicycle implements Cycle {

	@Override
	public void method1() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("MOBIKE");
	}
}

class BicycleFactory implements CycleFactory {

	@Override
	public Cycle getFactory() {
		// TODO 自動生成されたメソッド・スタブ
		return new Bicycle();
	}
}
class Ticycle implements Cycle{

@Override
public void method1() {
	// TODO 自動生成されたメソッド・スタブ
	System.out.println("xiaoming");
}

}
class TicycleFactory  implements CycleFactory{

@Override
public Cycle getFactory() {
	// TODO 自動生成されたメソッド・スタブ
	return new Ticycle();
}
}
public class test18 {
public static void get(CycleFactory fac){
	Cycle s=fac.getFactory();
	s.method1();
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		get(new TicycleFactory());
		get(new BicycleFactory());
		get(new UnicycleFactory());
	}

}
