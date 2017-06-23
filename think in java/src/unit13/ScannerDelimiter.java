package unit13;

import java.util.Scanner;

public class ScannerDelimiter {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner("I am you father");
		scanner.useDelimiter("\\s* \\s*");
		while(scanner.hasNext()){
			System.out.println(scanner.next());
		}
	}

}
