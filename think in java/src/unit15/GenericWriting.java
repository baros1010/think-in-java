package unit15;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {
	static <T> void writeExact(List<T> list,T item){
		list.add(item);
	};
	static List<Apple> apples=new ArrayList<Apple>();
	static List<Fruit> fruit=new ArrayList<Fruit>();
	static void f1(){
		writeExact(apples,new Apple());
		//writeExact(fruit,new Apple()); error
	}
	static <T> void writeExact2(List<? super T> lists,T item){
		lists.add(item);
	}
	static void f2(){
		writeExact2(apples,new Apple());
		writeExact2(fruit,new Apple());
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		f1();
		f2();
	}

}
