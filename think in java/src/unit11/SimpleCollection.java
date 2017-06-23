package unit11;

import java.util.*;


public class SimpleCollection {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Collection<Integer> c=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			c.add(i);
		for(int a:c)
			System.out.println(a);
	}

}
