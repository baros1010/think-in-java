package unit15;

public class Tuple {
	public static <A, B> TwoTuple<A, B> tuple(A a, B b) {
		return new TwoTuple<A, B>(a, b);
	}

	public static <A, B, C> ThreeTuple<A, B, C> Threetuple(A a, B b, C c) {
		return new ThreeTuple<A, B, C>(a, b, c);
	}
	static TwoTuple<String,Integer> f(){
		return tuple("1",1);
	}
	static ThreeTuple<String,String ,String> g(){
		return Threetuple("A","B","C");
	}
	public static void main(String[] args){
		System.out.println(f());
		System.out.println(g());
	}
}
