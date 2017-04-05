package unit8;
class Super{
	public int field=0;
	public int getfield(){return field;}
}
class Sub extends Super{
	public int field=1;
	public int getfield(){return field;}
	public int getsup(){return super.field;}
}
public class FieldAccess {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Super sup=new Sub();
System.out.println(sup.field+""+sup.getfield());
Sub sub=new Sub();
System.out.println(sub.field+""+sub.getfield()+""+sub.getsup());
	}

}
