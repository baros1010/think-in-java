package unit16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FillingArrays {
	
	public static void main(String[] args){
		int size=6;
		boolean []a1=new boolean[size];
		int [] a2=new int [size];
		String [] a3=new String[size];
		int[] a4={1,2,3,3};
		Arrays.fill(a1, true);
		Arrays.fill(a2, 3);
//		Arrays.fill(a2, 1,2,3);
		Arrays.fill(a3, "hello");
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		List<Integer> list=new ArrayList<Integer>();
		list.addAll(Arrays.asList(1,2,3,4));
		System.out.println(list);
	}
}
