package unit14;

import java.util.Random;

class Initable{
static final int staticFinal =47;
static final int staticFinal2=ClassInitalization.rand.nextInt(1000);
static{
	System.out.println("1");
}

}
class Initable2 {
static final int staticFinal =147;

static{
	System.out.println("2");
}
}
class Initable3{
static final int staticFinal =21147;

static{
	System.out.println("3");
}
}
public class ClassInitalization {
	public static Random rand=new Random(47);
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Class initable=Initable.class;
		System.out.println("after 1");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticFinal);
		System.out.println(Initable3.staticFinal);
	}

}
