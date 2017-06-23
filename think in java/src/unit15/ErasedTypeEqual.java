package unit15;

import java.util.ArrayList;

public class ErasedTypeEqual {
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Class c1=new ArrayList<String>().getClass();
		Class c2=new ArrayList<Integer>().getClass();
		System.out.println(c1==c2);
		ArrayList<String> c3=new ArrayList<String>();
		ArrayList<String> c4=new ArrayList<String>();
		System.out.println(c3==c4);
	}

}
