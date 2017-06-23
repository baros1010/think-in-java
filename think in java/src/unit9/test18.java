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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("OFO");
	}
}

class UnicycleFactory implements CycleFactory {

	@Override
	public Cycle getFactory() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return new Unicycle();
	}
}

class Bicycle implements Cycle {

	@Override
	public void method1() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("MOBIKE");
	}
}

class BicycleFactory implements CycleFactory {

	@Override
	public Cycle getFactory() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return new Bicycle();
	}
}
class Ticycle implements Cycle{

@Override
public void method1() {
	// TODO �����������ꂽ���\�b�h�E�X�^�u
	System.out.println("xiaoming");
}

}
class TicycleFactory  implements CycleFactory{

@Override
public Cycle getFactory() {
	// TODO �����������ꂽ���\�b�h�E�X�^�u
	return new Ticycle();
}
}
public class test18 {
public static void get(CycleFactory fac){
	Cycle s=fac.getFactory();
	s.method1();
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		get(new TicycleFactory());
		get(new BicycleFactory());
		get(new UnicycleFactory());
	}

}
