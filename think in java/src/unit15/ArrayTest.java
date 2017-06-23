package unit15;

public class ArrayTest {
static final int SIZE=100;
static Generic<Integer>[] gia;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//!!gia=(Generic<Integer>[])new Object[SIZE];
		gia=(Generic<Integer>[])new Generic[SIZE];
		System.out.println(gia.getClass().getSimpleName());
		gia[0]=new Generic<Integer>();
		//!gia[1]=new Object();
		//!gia[2]=new Generic<Double>();
	}

}
