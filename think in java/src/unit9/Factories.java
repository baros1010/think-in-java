package unit9;

interface Service {
	void method1();

	void method2();

}

interface ServiceFacrory {
	Service getService();
}

class Implementationa1 implements Service {

	@Override
	public void method1() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Implementational1 method1");
	}

	@Override
	public void method2() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Implementational1 method2");
	}
}

class Implementation1Facrory implements ServiceFacrory {

	@Override
	public Service getService() {
		// TODO 自動生成されたメソッド・スタブ
		return new Implementationa1();
	}
}

class Implementationa2 implements Service {

	@Override
	public void method1() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Implementational2 method1");
	}

	@Override
	public void method2() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Implementational2 method2");
	}
}
class Implementation2Facrory implements ServiceFacrory{

	@Override
	public Service getService() {
		// TODO 自動生成されたメソッド・スタブ
		return new Implementationa2();
	}}
public class Factories {
public static void serviceComsumer(ServiceFacrory fact){
	Service s=fact.getService();
	s.method1();
	s.method2();
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		serviceComsumer(new Implementation2Facrory());
		serviceComsumer(new Implementation1Facrory());
	}

}
