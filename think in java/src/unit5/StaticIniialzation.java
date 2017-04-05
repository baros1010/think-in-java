package unit5;

class Bowl {
	Bowl(int i) {
		System.out.println("Bowl(" + i + ")");

	}
	void f1(int i){
		System.out.println("f1(" + i + ")");
	}
 }
class Table{
	static Bowl bowl1=new Bowl(1);
	Table(){
	//	static Bowl bowl2=new Bowl(1);//不能这么用
		System.out.println("Table()");
		Bowl bowl2=new Bowl(2);
	}void f2(int i){
		System.out.println("f2(" + i + ")");
	}
	
}
class Cupboard{
	static Bowl bowl3=new Bowl(3);
	Bowl bowl4=new Bowl(4);
	Cupboard(){
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}void f3(int i){
		System.out.println("f3(" + i + ")");
	}
	static Bowl bowl5=new Bowl(5);
}
public class StaticIniialzation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		static Table t=new Table();不能这么用
//		static Cupboard c=new Cupboard();不能这么用
		System.out.println("main");
		new Cupboard();
		System.out.println("main");
		t.f2(2);
		c.f3(3);
	}
static Table t=new Table();
static Cupboard c=new Cupboard();
}
