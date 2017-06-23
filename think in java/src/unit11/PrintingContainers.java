package unit11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class PrintingContainers {
	static Collection fill( Collection<String> c){
		c.add("rat");
		c.add("cat");
		c.add("dog");
		c.add("dog");
		return c;
	}
	static Map fill(Map<String,String> m){
		m.put("cat", "Tom");
		m.put("rat", "Jom");
		m.put("dog", "Tim");
		m.put("dog", "Timmy");
		return m;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new HashMap<String,String>()));
	}

}
