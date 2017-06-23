package unit11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class list {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> c=new ArrayList<String>();
		c.add("love live");
		c.add("Steins;Gate");
		c.add("Code geass");
		System.out.println(c);
		int a=c.indexOf("love live");
		System.out.println(a);
		String s=((ArrayList<String>) c).get(1);
		System.out.println(s);
	 c.set(1, "pdd");
	 System.out.println(c);	
		List<String> c1=new ArrayList<String>();
		c1.add("aa");
		c1.add("love live");
		c1.add("1");
		c1.add("3");
		c1.add("2");
		c.retainAll(c1);
		System.out.println(c);
		List<String> c2=c1.subList(0, 2);
		System.out.println(c2);
	}

}
