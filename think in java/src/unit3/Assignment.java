package unit3;

class Tank {
	int a;
}
public class Assignment {
	public static void main(String[] args){
		Tank t1=new Tank();
		Tank t2=new Tank();
		t1.a=1;
		t2.a=2;
		System.out.println("t1.a="+t1.a+" t2.a="+t2.a);
		t1=t2;
		System.out.println("t1.a="+t1.a+" t2.a="+t2.a);
		t1.a=20;
		System.out.println("t1.a="+t1.a+" t2.a="+t2.a);
	}
	
	
}
