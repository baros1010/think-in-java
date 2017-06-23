package unit11;

import java.util.*;
import java.util.Collection;
import java.util.Map;

public class test4 {
@SuppressWarnings({ "unchecked", "rawtypes" })
static Collection test(Collection c){
	c.add("love live");
	c.add("Steins;Gate");
	c.add("Code Geass");
	return c;
}
static Map test(Map<String,String>m){
	m.put("1", "love live");
	m.put("2", "Steins;Gate");
	m.put("3", "Code Geass");
	return m;
	
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(test(new ArrayList()));
		System.out.println(test(new HashMap()));
	}

}
