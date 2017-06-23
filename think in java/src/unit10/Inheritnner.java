package unit10;
class WithInner{
	class Inner{}
}
public class Inheritnner extends WithInner.Inner{
	Inheritnner(WithInner wi){
		wi.super();
	}
	public static void main(String[] args){
		WithInner wi=new WithInner();
		Inheritnner ii=new Inheritnner(wi);
	}
}
