package unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test2 {
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		Integer[] a={1,2,3,4,5,6};
		Integer[] b={4,5,6,7,8,9};
		list.addAll(Arrays.asList(a));
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(Arrays.asList(b));
		//list.retainAll(list2);
		list.removeAll(list2);
		System.out.println(list);
		
	}
	
}
