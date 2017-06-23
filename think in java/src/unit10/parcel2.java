package unit10;

public class parcel2 {
class Contents{
	private int i=11;
	public int value(){return i;};
}
class Destunation{
	private String label;
	Destunation(String whereTo){
		label=whereTo;
	}
	String readLabel(){return label;}
} 
public Destunation to(String s){
	return new Destunation(s);
}
public Contents contents(){
	return new Contents();
}
public void ship(String dest){
	Contents c=contents();
	Destunation d=to(dest);
	System.out.println(d.readLabel());
}
public static void main(String[] args){
	parcel2 p=new parcel2();
	p.ship("haha");
	parcel2 q=new parcel2();
	parcel2.Contents c=q.contents();
	parcel2.Destunation d=q.to("xixi");
}
}
