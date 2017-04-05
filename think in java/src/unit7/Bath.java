package unit7;
class Soap{
	private String s;
	Soap(){
		System.out.println("Soap()");
		s=" no gg";
	}
	public String toString(){
		return s;	
	}
}
public class Bath {
private String s1="1",s2="2",s3,s4;
private Soap s;
private int i;
private float f;
public Bath(){
	System.out.println("Bath()");
	s3="joy";
	f=3.14f;
	s=new Soap();
}
public String toString(){
	s4="4";
	return "s1="+s1+""+
	"s1="+s2+""+
	"s3="+s3+""+
	"s4="+s4+"\n"+
	"i="+i+""+"f="+f+""+
	"s="+s;
}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Bath b=new Bath();
		System.out.println(b);
	}

}
