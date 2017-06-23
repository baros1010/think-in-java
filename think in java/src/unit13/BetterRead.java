package unit13;

import java.util.Scanner;

public class BetterRead {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stidn=new Scanner(SimoleRead.input);
		System.out.println("what is your name");
		String name=stidn.nextLine();
		System.out.println(name);
		System.out.println("How old are you ");
		int age=stidn.nextInt();
		double fa=stidn.nextDouble();
		System.out.println(name);
		System.out.println(age);
		System.out.println(fa);
		
	}

}
