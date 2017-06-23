package unit11;

import java.util.*;

public class SetOfInterger {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand=new Random(47);
		//Set<Integer> inset=new HashSet<Integer>();
		Set<Integer> inset=new TreeSet<Integer>();
		//List<Integer> inset=new LinkedList<Integer>();
		for(int i=0;i<1000;i++)
			inset.add(rand.nextInt(30));
			System.out.println(inset);
		
	}

}
