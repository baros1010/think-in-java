package unit15;

public class BasicHolder<T> {

	T t;

	void set(T t) {
		this.t = t;
	}

	T get() {
		return t;
	}

	void f() {
		System.out.println(t.getClass().getSimpleName());
	}
}
