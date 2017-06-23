package unit15;

public class Wildcards {
	static void rawArgs(Holder holder, Object arg) {
		holder.Set(arg);// warnning
		holder.Set(new Wildcards());// warnning
		// T t=holder.get();
		Object obj = holder.get();
	}

	static void f2(Holder<?> holder, Object arg) {
		// holder.Set(arg);
		// holder.Set(new Wildcards());//warnning
		// T t=holder.get();
	}

	static <T> T exact1(Holder<T> holder) {
		T t = holder.get();
		return t;
	}

	static <T> T exact2(Holder<T> holder, T arg) {
		holder.Set(arg);
		T t = holder.get();
		return t;
	}

	static <T> void f3(Holder<? super T> holder, T arg) {
		holder.Set(arg);
		// T t=holder.get(); error
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Holder raw = new Holder<Long>();
		raw = new Holder();
		Holder<Long> qualifided = new Holder<Long>();
		Holder<?> unbound = new Holder<Long>();
		Holder<? extends Long> bound = new Holder<Long>();
		rawArgs(raw, 1L);
		rawArgs(qualifided, 1L);
		rawArgs(unbound, 1L);
		rawArgs(bound, 1L);

		f2(raw, 1L);
		f2(qualifided, 1L);
		f2(unbound, 1L);
		f2(bound, 1L);

		Object r1 = exact1(raw);
		Long r2 = exact1(qualifided);
		Object r3 = exact1(unbound);// must return Object
		Long r4 = exact1(bound);

		Long r5 = exact2(raw, 1L);
		Long r6 = exact2(qualifided, 1L);
		// Long r7=exact2(unbound,1L);
		// Long r8=exact2(unbound,1L);ERROR
		
		
	}

}
