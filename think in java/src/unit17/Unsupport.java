package unit17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Unsupport {
	static void test(List<String> list) {
		Collection<String> c = list;
	//	Collection<String> sublist = list.subList(1, 8);
		Collection<String> c2 = new ArrayList<String>(Arrays.asList("A B C D E".split(" ")));
		try {
			c.retainAll(c2);
		} catch (Exception e) {
			System.out.println("retain" + e);
		}
		try {
			c.removeAll(c2);
		} catch (Exception e) {
			System.out.println("removeAll" + e);
		}
		try {
			c.clear();
		} catch (Exception e) {
			System.out.println("clear" + e);
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list=new ArrayList<String>();
		list=Arrays.asList("A B C D E F G H I J K L".split(" "));
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
//		list.add("E");
//		list.add("F");
//		list.add("G");
//		list.add("H");
		test(list);

	}

}
