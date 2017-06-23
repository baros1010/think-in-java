package unit15;
class Amphibian{}
class Vehicle{}
public class TupleTest {
	static TwoTuple<String,Integer> f1(){
		return new TwoTuple<String,Integer>("1",1);
	}
	static ThreeTuple<String,Integer,Integer> f3(){
		return new ThreeTuple<String,Integer,Integer>("1",1,1);
	}
	static ThreeTuple<Amphibian,Integer,Integer> f2(){
		return new ThreeTuple<Amphibian,Integer,Integer>(new Amphibian(),1,1);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(f1());
		System.out.println(f3());
		System.out.println(f2());
	}

}
