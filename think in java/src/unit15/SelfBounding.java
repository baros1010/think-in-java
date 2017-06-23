package unit15;
class SelfBounded<T extends SelfBounded<T>>{
	T element;
	SelfBounded<T> set(T arg){
		element=arg;
		return this;
	}
	T get(){return element;}
}
class A extends SelfBounded<A>{}
class B extends SelfBounded<B>{}
class C extends SelfBounded<C>{
	C setAndGet(C arg){
		set(arg);
		return get();
	}
}
class D {
	
}

//class E extends SelfBounded<D>{}  error
class F extends SelfBounded{}

public class SelfBounding {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		A a=new A(); 
	}

}
