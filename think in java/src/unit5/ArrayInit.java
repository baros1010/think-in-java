package unit5;

import java.util.Arrays;

public class ArrayInit {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer []a=new Integer[] {1,2,3};
		Integer []a1=new Integer[] {new Integer(1),new Integer(2),new Integer(3)};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a1));
		for(Integer a2:a1){
			System.out.println(a2);
		}
	}

}
