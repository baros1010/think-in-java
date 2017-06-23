package unit17;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SortedSet<String> sortSet=new TreeSet<String>();
		Collections.addAll(sortSet, "I AM YOUR FATHER la la la".split(" "));
		System.out.println(sortSet);
		System.out.println(sortSet.first());
		Iterator<String> it=sortSet.iterator();
		String s=sortSet.first();
		String s1=sortSet.last();
		for(int i=0;i<6;i++){
			if(i==3) s=it.next();
			if(i==6) s1=it.next();
			//else it.next();
		}
		System.out.println(s);
		System.out.println(s1);
		
	}

}
