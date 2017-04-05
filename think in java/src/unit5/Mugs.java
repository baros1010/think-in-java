package unit5;
class Mug{
	Mug(int i){
		System.out.println(i);
	}
	void f1(int i){
		System.out.println(i);
	}
}
public class Mugs {
	Mug mug1=new Mug(1);
	Mug mug2=new Mug(2);
//Mug mug1;
//Mug mug2;
//{
//	
//mug1=new Mug(1);
//mug1=new Mug(2);
//System.out.println("mug1&mug2");
//}
Mugs(){
	System.out.println("mugs()");
	
	
	
}
Mugs(int i){
	System.out.println("mugs(int)");
	
	
	
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
new Mugs();
System.out.println("//////////////");
new Mugs(2);
	}

}
