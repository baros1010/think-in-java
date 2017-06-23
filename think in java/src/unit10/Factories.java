package unit10;
interface Service{
	void method1();
	void method2();
}
interface ServiceFactory{
	Service getServiceFactory();
}
class Implementation1 implements Service{

	@Override
	public void method1() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("imp1 method1");
	}

	@Override
	public void method2() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("imp1 method2");
	}
	public static ServiceFactory factory=
			new ServiceFactory(){

				@Override
				public Service getServiceFactory() {
					// TODO 自動生成されたメソッド・スタブ
					return new Implementation1() ;
				}
				};
	}
class Implementation2 implements Service{

	@Override
	public void method1() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("imp2 method1");
	}

	@Override
	public void method2() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("imp2 method2");
	}
	public static ServiceFactory factory=new ServiceFactory(){

		@Override
		public Service getServiceFactory() {
			// TODO 自動生成されたメソッド・スタブ
			return new Implementation2();
		}};
	}

public class Factories {
public static void get(ServiceFactory fact){
	Service s=fact.getServiceFactory();
	s.method1();
	s.method2();
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		get(Implementation1.factory);
		get(Implementation2.factory);
	}

}
