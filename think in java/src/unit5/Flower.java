package unit5;

public class Flower {
	int peralCount=0;
	String s="int";
	Flower(int petals){
		peralCount=petals;
		System.out.println("int args"+peralCount);
	}
	Flower(String ss){
	
		System.out.println("String args"+ss);
		s=ss;
		
	}
	Flower(String ss,int petals){
		
		this(petals);
		//this(s); cant call two
		this.s=s;
		System.out.println("String&&int");
		
	}
	Flower(){
		
	this("hi",47);
	System.out.println("default constructor(no args)");
		
	}
	void print(){
		
		System.out.println("peralCount="+peralCount+"s="+s);
	}
	public static void main(String[] args){
		Flower f=new Flower();
		f.print();
	}
	
}
