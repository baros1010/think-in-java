package unit7;

public class SpaceShipDelegation {
private String name;
private SpaceShipControl c=new SpaceShipControl();
SpaceShipDelegation(String name){
	this.name=name;
	
	
}
public void back(int i){
	c.back(i);
}
public void down(int i){
	c.down(i);
}
public void up(int i){
	c.up(i);
}
public void left(int i){
	c.left(i);
}
public void right(int i){
	c.right(i);
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SpaceShipDelegation p=new SpaceShipDelegation("1");
		p.back(1000);
	}

}
