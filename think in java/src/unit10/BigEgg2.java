package unit10;
class Egg2{
	protected class Yolk{
		public Yolk(){System.out.println("haha");}
		public void f(){System.out.println("f()");}
	}
	private Yolk y=new Yolk();
	public Egg2(){System.out.println("new Egg()");}
	public void insertYolk(Yolk yy){y=yy;}
	public void g(){y.f();}
}
public class BigEgg2 extends Egg2{
	public class Yolk extends Egg2.Yolk{
		public Yolk(){System.out.println("BigEgg2.Yolk()");}
		public void f(){System.out.println("BigEgg2.f()");}
	}
	public BigEgg2(){insertYolk(new Yolk());}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Egg2 e2=new Egg2();
		e2.g();
	}

}
