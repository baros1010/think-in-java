package unit7;

class Vallain {
	private String name;

	public Vallain(String name) {
		this.name = name;
	}

	protected void set(String num) {
		name = num;
	}

	public String toString() {
		return "I am your father" + name;
	}
};

public class Orc extends Vallain {
	private int orc;

	public Orc(String name, int orc) {
		super(name);
		this.orc = orc;
	}
	public void change(String name,int orc){
		set(name);
		this.orc=orc;
		
	}
	public String toString(){
		return "1"+super.toString();
	}
	public static void main(String[] args){
		Orc o=new Orc("haha",1);
		System.out.println(o);
		o.change("1", 2);
		System.out.println(o);
	}
}
