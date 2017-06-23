package unit15;

public class Holder<T> {
	private T values;

	public Holder() {
	}

	public Holder(T values) {
		this.values = values;
	}

	 public void Set(T val) {
		values = val;
	}
	public T get(){return values;}
	public boolean equals(Object o) {
		return values.equals(o);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Holder<Apple> a = new Holder<Apple>();
		Apple d=a.get();
		Holder<? extends Fruit> f=a;
		Fruit p=f.get();
		d=(Apple)f.get();
		try{
			Orange c=(Orange)f.get();
		}catch(Exception e){
			System.out.println(e);
		}
		//f.Set(new Apple());
	}

}
