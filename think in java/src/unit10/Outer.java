package unit10;

public class Outer {
class Inner{
	Inner(){
		System.out.println("hahaha");
	}
}
Inner test(){
	return new Inner();
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Outer o=new Outer();
Outer.Inner i=o.test();
Outer.Inner is=o.new Inner();
	}

}
