package Suanfalianxi;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] ss = s.split(" ");
		for (int i = ss.length-1; i >= 0; i--) {
			System.out.print(ss[i]+" ");

		}
	}
}
