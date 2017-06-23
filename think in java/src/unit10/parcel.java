package unit10;

public class parcel {
class Contents{
	private int i=1;
	public int value(){return i;}

}
class Destination{
	private String label;
	Destination(String whereTo){
		label=whereTo;
	}
	String readLabel(){return label;}
}
public  void ship(String dest){
	Contents c=new Contents();
	Destination d=new Destination(dest);
	System.out.println(d.readLabel());
}
public static void main(String[] args){
	parcel p=new parcel();
	p.ship("hahaha");
}
}
