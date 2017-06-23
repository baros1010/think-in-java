package unit15;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {

	public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
		for(int i=0;i<n;i++){
			coll.add(gen.next());
		}
		return coll;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Collection<Coffee> coffee=fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
		for(Coffee c:coffee)
			System.out.println(c);
		Collection<Integer> fn=fill(new ArrayList<Integer>(),new Fibonacci(),12);
		for(int i :fn)
			System.out.print(""+i+" ");
		
		 
	}

}
