package unit7;
class Art{
	Art(){
		System.out.println("art");
	}
}
 class draw extends Art{
	 draw(){
		 System.out.println("draw");
	 }
 }
public class Cartoon extends draw{
	Cartoon(){
		System.out.println("Cartoon");
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Cartoon c=new Cartoon();

	}

}
