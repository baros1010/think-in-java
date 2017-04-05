package unit7;
class Arts{
	Arts(int i){
		System.out.println("art");
	}
}
 class draws extends Arts{
	 draws(int i){
		 super(1);
		 System.out.println("draw");
	 }
 }
public class test6 extends draws{
 test6(){
	 super(1);
	 System.out.println("test6");
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		test6 t=new test6();
	}

}
