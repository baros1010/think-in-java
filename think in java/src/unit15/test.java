package unit15;

import java.util.ArrayList;
import java.util.Random;

public class test<T> {
	Random rand=new Random(47);
ArrayList<T> list=new ArrayList<T>();
public  void add(T item){list.add(item);}
public T select(){
	return list.get(rand.nextInt(list.size()));
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		test<String> t=new test<String>();
		for(String s:"wo qu ni ma le ge bi".split(" "))	
		t.add(s);
		for(int i=0;i<10;i++)
			System.out.println(t.select());
	}

}
