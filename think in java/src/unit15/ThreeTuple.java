package unit15;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
	public final C third;
	public ThreeTuple(A a, B b,C c) {
		super(a, b);
		third=c;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public String toString(){
		return "("+first+","+second+","+third+")";
	}

}
