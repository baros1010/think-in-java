package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HsahMapReview {

	public static void main(String[] args) {
	
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		System.out.println("1".hashCode());
		String a = "1";
		System.out.println(a.hashCode());
		System.out.println(new HsahMapReview().hashCode());
		System.out.println(new HsahMapReview().hashCode());
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {// 遍历map首选
			Entry<String, String> entry = (Entry<String, String>) it.next();
			System.out.println(entry.getKey()+"："+entry.getValue());
		}
		System.out.println(".....................");
		for (String s : map.keySet()) {
			System.out.println(s + ":" + map.get(s));
		}

	}

}
