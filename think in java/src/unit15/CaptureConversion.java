package unit15;

public class CaptureConversion {
	static <T> void f1(Holder<T> holder){
		T t=holder.get();
		System.out.println(t.getClass().getSimpleName());
	}
	static void f2(Holder<?> holder){
		f1(holder);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Holder raw=new Holder<Integer>(2);
		f1(raw);
		Holder rawbase=new Holder();
		rawbase.Set(new Object());
		f2(rawbase);
		Holder<?> h=new Holder<Double>(1.0);
		f2(h);
		

	}

}
