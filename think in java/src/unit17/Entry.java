package unit17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Entry {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 4);
		map.put("4", 4);
		map.put("5", 5);
		map.put("5", 6);
		System.out.println(map);
		Iterator i=map.entrySet().iterator();
		
		while(i.hasNext()){
			Map.Entry<String, Integer> entry=(Map.Entry<String, Integer>)i.next();
			System.out.println(entry.getKey().toCharArray());
		}
	}

}
