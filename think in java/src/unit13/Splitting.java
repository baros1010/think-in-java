package unit13;

import java.util.Arrays;

public class Splitting {
	public static String Knights="I am your father,hahaha"+"you are my son...";
	public static void split(String regex){
		System.out.println(Arrays.toString(Knights.split(regex)));
	}
	public static void main(String[] args) {
		split(" ");
		split("\\W+");
		split("n\\W+");
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
