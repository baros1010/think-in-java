package unit16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BerlliumSphere{
	private static long counter;
	private final long id=counter++;
	public String toString(){
		return "Sphere"+id;
	}
}

public class CotainerComparison {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BerlliumSphere[] s1=new BerlliumSphere[10];
		for(int i=0;i<5;i++)
			s1[i]=new BerlliumSphere();
			System.out.println(Arrays.toString(s1));
			List<BerlliumSphere> s2=new ArrayList<BerlliumSphere>();
			for(int j=0;j<5;j++)
				s2.add(new BerlliumSphere());
				System.out.println(s2);
				System.out.println(s2.get(2));
		
	}

}
