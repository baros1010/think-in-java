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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Unicycle cl=new Unicycle();
		Ride(cl);
	}

	

}
