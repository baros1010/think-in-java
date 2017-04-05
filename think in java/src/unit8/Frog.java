package unit8;

class Characteristic {
	private String s;

	Characteristic(String s) {
		this.s = s;
		System.out.println("Create Characteristic"+s);
	}
	protected void dispose(){
		System.out.println("disposing Characteristic"+s);
	}

}
class Description{
	private String s;

	Description(String s) {
		this.s = s;
		System.out.println("Create Description"+s);
	}
	protected void dispose(){
		System.out.println("disposing Description"+s);
	}
}
class LivingCreature{
	private Characteristic p=new Characteristic("balabala");
	private Description p1=new Description("111");
	LivingCreature(){
		System.out.println("LivingCreature()");
	}
	protected void dispose(){
		System.out.println("dispose LivingCreature");
		p1.dispose();
		p.dispose();
	}
}
class Amimal extends LivingCreature{
	private Characteristic p=new Characteristic("haha");
	private Description p1=new Description("222");
	Amimal(){
		System.out.println("Amimal()");
	}
	protected void dispose(){
		System.out.println("dispose Amimal");
		p1.dispose();
		p.dispose();
		super.dispose();
	}

}
class Amphibian extends Amimal{
	private Characteristic p=new Characteristic("lalala");
	private Description p1=new Description("333");
	Amphibian(){
		System.out.println("Amphibian()");
	}
	protected void dispose(){
		System.out.println("dispose Amphibian");
		p1.dispose();
		p.dispose();
		super.dispose();
	}

}
public class Frog extends Amphibian{
	private Characteristic p=new Characteristic("xixixi");
	private Description p1=new Description("333");
	Frog(){
		System.out.println("Frog()");
	}
	protected void dispose(){
		System.out.println("dispose Forg");
		p1.dispose();
		p.dispose();
		super.dispose();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Frog f=new Frog();
		System.out.println("///////////");
		f.dispose();
		
	}

}
