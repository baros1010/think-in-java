package unit13;

import java.util.Scanner;

public class ScannerDelimiter {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner("I am you father");
		scanner.useDelimiter("\\s* \\s*");
		while(scanner.hasNext()){
			System.out.println(scanner.next());
		}
	}

}
