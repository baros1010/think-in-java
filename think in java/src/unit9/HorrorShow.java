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
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void destory() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
}
interface Vampire extends Lethal,DangerousMonster{
	void drinkblood();
}
class veryBadVampire implements Vampire{

	@Override
	public void kill() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void destory() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void menace() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void drinkblood() {
		// TODO 自動生成されたメソッド・スタブ
		
	}}
public class HorrorShow {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
