package unit7;

public class SpaceShip extends SpaceShipControl{
private String name;
public SpaceShip(String name){
	this.name=name;
}
public String toSting(){return name;}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		SpaceShipControl sp=new SpaceShipControl();
		sp.forward(100);
	}

}
