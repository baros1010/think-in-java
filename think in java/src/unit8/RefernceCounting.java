package unit8;
class Shared{
	private int refcount=0;
	private static long counter;
	private final long id=counter++;
	public Shared(){
		System.out.println("Creating"+this);
	}
	public void addRef(){refcount++;System.out.println(refcount);}
//	protected void finalize() {
//		if(refcount != 0)
//			System.out.println("Error: " + refcount + " Shared " + id + " objects in use");
//	}
	protected void dispose(){
		if(--refcount==0){
			System.out.println("disposeing"+this);	
		}
	}
	public String toString(){return "shared"+id;}

}
class Composing{
	private Shared shared;
	private static long counter=0;
	private final long id=counter++;
	public Composing(Shared shared){
		System.out.println("Creating"+this);
		this.shared=shared;
		this.shared.addRef();//调用5次，没新建一次调用一次
		
	}
	
	protected void dispose(){
		System.out.println("disposeing"+this);	
		shared.dispose();
	}
	public String toString(){return "disposeing"+id;}
}
public class RefernceCounting {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shared shared=new Shared();
		Composing[] c={new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared)};
		for(Composing cc:c)
			cc.dispose();
		
//		Composing compTest = new Composing(shared);
//		Composing compTest2 = new Composing(shared);
//		// Test finalize():
//		shared.finalize();
//		Shared sharedTest = new Shared();
//		Composing compTest3 = new Composing(sharedTest);
//		// Test sharedTest finalize():
//		sharedTest.finalize();
	}
	

}
