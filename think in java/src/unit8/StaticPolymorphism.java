package unit8;
class StaticSuper{
	public static void f1(){
		System.out.println("f1()");
	}
	public void f2(){
		System.out.println("f2()");
	}
}
class Static extends StaticSuper{
	public static void f1(){
		System.out.println("f33()");
	}
	public void f2(){
		System.out.println("f3()");
	}
}
public class StaticPolymorphism {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StaticSuper sup=new Static();
		sup.f2();
		sup.f1();
		Static sub=new Static();
	
		sub.f1();
	}

}
