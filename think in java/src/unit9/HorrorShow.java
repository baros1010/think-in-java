package unit9;
interface Monster{
	void menace();
}
interface DangerousMonster extends Monster{
	void destory();
}
interface Lethal{
	void kill();
}
class dragonZilla implements DangerousMonster{

	@Override
	public void menace() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void destory() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}
	
}
interface Vampire extends Lethal,DangerousMonster{
	void drinkblood();
}
class veryBadVampire implements Vampire{

	@Override
	public void kill() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void destory() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void menace() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void drinkblood() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}}
public class HorrorShow {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

}
