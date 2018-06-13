package unit14;

import java.util.Random;

class Initable{
static  int staticFinal =47;
static  int staticFinal2=ClassInitalization.rand.nextInt(1000);
static{
	System.out.println("Initable");
}

}
class Initable2 {
static final int staticFinal =147;

static{
	System.out.println("Initable2");
}
}
class Initable3{
static final int staticFinal =21147;

static{
	System.out.println("Initable3");
}
}
public class ClassInitalization {
	public static Random rand=new Random(47);
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Class<?> initable=Initable.class;
		System.out.println("afterxx");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticFinal);
		Class.forName("unit14.Initable3");
		System.out.println(Initable3.staticFinal);
	}

}
