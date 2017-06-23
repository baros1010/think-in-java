package unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Modify {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand=new Random(47);
		Integer[] ia={1,2,3,4,5};
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(ia));
		System.out.println("before"+list1);
		Collections.shuffle(list1, rand);
		System.out.println("after"+list1);
		System.out.println("array"+Arrays.toString(ia));
		List<Integer> list2=Arrays.asList(ia);
		Collections.shuffle(list2, rand);
		System.out.println("after"+list2);
	}

}
