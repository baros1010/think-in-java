package unit15;

import java.util.Arrays;
import java.util.List;

public class GenericReading {
	static <T> T readExact(List<T> list) {
		return list.get(0);
	}

	static List<Fruit> fruit = Arrays.asList(new Fruit());
	static List<Apple> apples = Arrays.asList(new Apple());
	static void f1(){
		Apple a=readExact(apples);
		Fruit f=readExact(fruit);
	}
	static class Reader<T>{
		T readExact(List<T> list){
			return list.get(0);
		}
	}
	static void f2(){
		Reader<Fruit> ff=new Reader<Fruit>();
		Fruit f1=ff.readExact(fruit);
		//Apple a1=ff.readExact(fruit); error
		
	}
	static class CovariantReader<T>{
		T readers(List<? extends T> list){
			return list.get(0);
		}
	}
	static void f3(){
		CovariantReader<Fruit> fr=new CovariantReader<Fruit>();
		Fruit f=fr.readers(fruit);
		Fruit a=fr.readers(apples);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
