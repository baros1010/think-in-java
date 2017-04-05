package unit7;
class Plate{
	Plate(int i){
		System.out.println("Plate");
	}
}
class DinnerPlate extends Plate{
	DinnerPlate(int i){
		super(i);
		System.out.println("DinnerPlate");
	}
}
class Utenil{
	Utenil(int i){
		System.out.println("Utenil");
	}
}
class Spoon extends Utenil{

	Spoon(int i) {
		super(i);
		System.out.println("Spoon");
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
}
class Fork extends Utenil{

	Fork(int i) {
		super(i);
		System.out.println("Fork");
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
}
class Knife extends Utenil{

	Knife(int i) {
		super(i);
		System.out.println("Knife");
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
}
 class Custom{
	
	Custom(int i){
		System.out.println("Custom");
	}
}
public class PlaceSetting extends Custom{
private Spoon sp;
private Fork fk;
private Knife kf;
private DinnerPlate dp;

	PlaceSetting(int i) {
		super(i+1);
		sp=new Spoon(i+1);
		fk=new Fork(i+1);
		kf=new Knife(i+1);
		dp=new DinnerPlate(i+1);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PlaceSetting pl=new PlaceSetting(0);
	}

}
