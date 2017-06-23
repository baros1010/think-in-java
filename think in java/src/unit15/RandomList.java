package unit15;

import java.util.ArrayList;
import java.util.Random;

public class RandomList <T>{
	private ArrayList<T> list=new ArrayList<T>();
	Random rand=new Random(47);
	public void add(T item){list.add(item);}
	private T select(){return list.get(rand.nextInt(list.size()));}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			RandomList<String> rs=new RandomList<String>();
			for(String s:"I am your father".split(" "))
				rs.add(s);
			for(int i=0;i<10;i++)
				System.out.println(rs.select()+" ");
	}

}
