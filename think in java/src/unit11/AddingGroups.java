package unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddingGroups {
	public static void main(String[] args){
		Collection<Integer> c=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts={6,7,8,9};
		c.addAll(Arrays.asList(moreInts));
		Collections.addAll(c, 1,2,3);
		Collections.addAll(c, moreInts);
	
		
	}
}
