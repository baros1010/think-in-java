package unit11;

import java.util.Collection;
import java.util.HashSet;

public class test2 {
	public static void main(String[] args){
		Collection<Integer> c=new HashSet<Integer>();
		for(int i=0;i<10;i++){
			c.add(i);
		}
		for(int a:c){
			System.out.println(a);
		}
	}
}
