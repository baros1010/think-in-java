package unit8;
class Grain{
	
	public String toString(){return "Grain";}
}
class Wheat extends Grain{
	public String toString(){return "Wheat";}
}
class Mill{
	public Grain pross(){return new Grain();}
}
class WheatMill extends Mill{
	public Grain pross(){return new Wheat();}
}
public class CovariantReturn {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Mill m=new Mill();
Grain g=m.pross();
System.out.println(g);
m=new WheatMill();
g=m.pross();
System.out.println(g);
	}

}
