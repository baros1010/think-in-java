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
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}
	
}
class Fork extends Utenil{

	Fork(int i) {
		super(i);
		System.out.println("Fork");
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}
	
}
class Knife extends Utenil{

	Knife(int i) {
		super(i);
		System.out.println("Knife");
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
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
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		PlaceSetting pl=new PlaceSetting(0);
	}

}
