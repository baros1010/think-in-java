package unit5;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassOjb {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Random rand =new Random(47);
		Integer[]	a=new Integer[rand.nextInt(20)];
		for(int i=0;i<a.length;i++){
			a[i]=rand.nextInt(500);
			//System.out.print(a[i]);
//			System.out.print(Arrays.toString(a));?
			
		}
		System.out.print(Arrays.toString(a));
	}

}
