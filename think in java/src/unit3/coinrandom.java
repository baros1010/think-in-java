package unit3;

import java.util.Random;

public class coinrandom {
	public static void main(String[] args) {

		Random rand = new Random();
		int i = rand.nextInt(2);
		String a = "����";
		if (i == 1) {
			a = "����";
		}
		System.out.println(a);
	}
}
