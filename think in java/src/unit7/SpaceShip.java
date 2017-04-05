package unit7;

public class SpaceShip extends SpaceShipControl{
private String name;
public SpaceShip(String name){
	this.name=name;
}
public String toSting(){return name;}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SpaceShipControl sp=new SpaceShipControl();
		sp.forward(100);
	}

}
