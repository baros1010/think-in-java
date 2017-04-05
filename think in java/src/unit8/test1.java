package unit8;
class Unicycle extends Cycle{
	
}
class Bicycle extends Cycle{
	
}
class Tricycle extends Cycle{

}
public class test1 {
	public static void Ride(Cycle cl){
		cl.test();
		cl.weels();
	};
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Unicycle cl=new Unicycle();
		Ride(cl);
	}

	

}
