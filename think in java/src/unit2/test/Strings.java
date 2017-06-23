package unit2.test;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = "i am your father";
		String [] ss=s.split(" ");
		for(String sa:ss)
		System.out.println(sa);
		char c = s.charAt(0);
		System.out.println(s.charAt(0));
		System.out.println(s.toCharArray());
		int i = s.compareTo("i am your mother");
		System.out.println(i);
		System.out.println(s.contains("i"));
		Integer j = null;
		// j.toString();
		String.valueOf(j);
		System.out.println(j);

	}

}
