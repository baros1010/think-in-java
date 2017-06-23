package unit10;
class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk(){System.out.println("haha");}
	}
	public Egg(){System.out.println("xixi");
	new Yolk();}
}
public class BigEgg extends Egg{
	public class Yolk{
		public Yolk(){System.out.println("yolo");}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new BigEgg();
	}

}
