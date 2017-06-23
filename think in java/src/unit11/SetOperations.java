package unit11;

import java.util.*;


public class SetOperations {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String> set1=new HashSet<String>();
		Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
		set1.add(("M"));
		System.out.println("H:"+set1.contains("H"));
		System.out.println("N:"+set1.contains("N"));
		Set<String> set2=new HashSet<String>();
		Collections.addAll(set2, "H I J K L".split(" "));
		System.out.println(set1.containsAll(set2));
		set1.remove("H");
		System.out.println(set1);
		System.out.println(set1.containsAll(set2));
		set1.removeAll(set2);
		System.out.println(set1);
		Collections.addAll(set1, "X Y Z".split(" "));
		System.out.println(set1);
	}

}
