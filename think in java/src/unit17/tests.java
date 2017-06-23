package unit17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class tests {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand =new Random();
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new LinkedHashSet<Integer>();
		Set<Integer> set3=new TreeSet<Integer>();
		for(int i=0;i<10;i++){
			set1.add(rand.nextInt(10));
			set2.add(rand.nextInt(10));
			set3.add(rand.nextInt(10));
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}

}
