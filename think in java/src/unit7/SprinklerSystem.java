package unit7;
class WaterSource{
	private String s;
	WaterSource(){
		System.out.println("WaterSource()");
		
	}
	public String toString(){
		return s;
	}
}
public class SprinklerSystem {
	private String valve1,valve2,valve3,valve4;
	private WaterSource ws=new WaterSource();
	private float f;
	private int i;
	public String toString(){
		return "valve1="+valve1+""+
				"valve2="+valve1+""+
				"valve3="+valve1+""+
				"valve4="+valve1+"\n"+
				"i="+i+""+"f="+f+""+
				"ws="+ws;
	}
	public static void main(String[] args) {
		SprinklerSystem system =new SprinklerSystem();
		System.out.println(system);
	}
}
