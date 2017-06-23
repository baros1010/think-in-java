package unit10;
interface A{}
interface B{}
class X implements A,B{}
class Y implements A{
	B makeB(){
		return new B(){};
	}
}
public class MultInterfaces {
	static void takesA(A a){}
	static void takesB(B b){}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		X x=new X();
		Y y=new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		takesB(y.makeB());
	}

}
