package unit9;
interface CanClimb{
	void Climb();
}
interface CanFight{
	void fight();
}
interface Canswim{
	void swim();
}
interface CanFly{
	void fly();
}
class ActionCharacter{
	public void fight(){}
}
class Hero extends ActionCharacter implements CanFight,Canswim,CanFly{

	@Override
	public void fly() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void swim() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}
	
}
public class Adventure {
public static void t(CanFight x){x.fight();}
public static void u(Canswim x){x.swim();}
public static void v(CanFly x){x.fly();}
public static void main(String args[]){
	Hero h=new Hero();
	t(h);
	u(h);
	v(h);
	
}
}
